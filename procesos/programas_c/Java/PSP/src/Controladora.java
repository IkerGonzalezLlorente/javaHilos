import java.util.*;
import java.text.*;

class Meollo{
	Date hoy;
	DateFormat df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,Locale.getDefault());
	final int MAXCOLA=5;
	private Vector mensajes=new Vector();
	public synchronized void ponerMensaje(){
		System.out.println(Thread.currentThread().getName()+" ha entrado en ponerMensaje");
		if(mensajes.size()==5){
			System.out.println("Vector al limite");
			try{
				wait();
				System.out.println(Thread.currentThread().getName()+" despertando del wait de ponerMensaje");
			}catch(InterruptedException e){}
		}
		hoy=new Date();
		mensajes.addElement("Estamos a "+df.format(hoy));
		notify();
		System.out.println(Thread.currentThread().getName()+" saliendo de ponerMensaje");
	}
	public synchronized String extraerMensaje(){
		System.out.println(Thread.currentThread().getName()+" ha entrado en extraerMensaje");
		notify();
		if(mensajes.size()==0){
			System.out.println("No hay elementos todavia");
			try{
				wait();
			}catch(InterruptedException e){}
		}
		String mensaje=(String)mensajes.firstElement();
		mensajes.removeElement(mensaje);
		System.out.println(Thread.currentThread().getName()+" saliendo de extraerMensaje");
		return mensaje;
	}
}
class Productor implements Runnable{
	Meollo meo;
	Thread hiloProductor;
	Productor(Meollo meo,String nombre){
		this.meo=meo;
		hiloProductor=new Thread(this,nombre);
		hiloProductor.start();
	}
	public void run(){
		while(true){
			meo.ponerMensaje();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
class Consumidor implements Runnable{
	Meollo meo;
	Thread hiloConsumidor;
	Consumidor(Meollo meo,String nombre){
		this.meo=meo;
		hiloConsumidor=new Thread(this,nombre);
		hiloConsumidor.start();
	}
	public void run(){
		while(true){
		       System.out.println("Mensaje pillado: "+meo.extraerMensaje());
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}
	}
}
public class Controladora{
	public static void main(String args[]){
		Meollo meo=new Meollo();
		new Productor(meo,"Productor");
		new Consumidor(meo,"Consumidor");
	}
}
