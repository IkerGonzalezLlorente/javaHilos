
class CalcularFactorial extends Thread {

	public double resultado = 0;
	private int dato;

	CalcularFactorial(String nombre, int numero) {
		super(nombre);
		dato = numero;
		setPriority(Thread.MAX_PRIORITY);
		start();
	}

	public void run() {
		System.out.println("Comienza hilo " + Thread.currentThread().getName());
		FactorialHilos fh = new FactorialHilos();
		resultado = fh.calculoFactorial(dato);
		System.out.println("Factorial de " + dato + "= " + resultado);
		System.out.println("Acaba hilo " + Thread.currentThread().getName());
	}
}

class CalcularRaizCuadrada extends Thread {

	public double resultado = 0;
	private int dato;

	CalcularRaizCuadrada(String nombre, int numero) {
		super(nombre);
		dato = numero;
		setPriority(Thread.MAX_PRIORITY);
		start();
	}

	public void run() {
		System.out.println("Comienza hilo " + Thread.currentThread().getName());
		resultado = Math.sqrt(dato);
		System.out.println("Raiz cuadrada de " + dato + "= " + resultado);
		System.out.println("Acaba hilo " + Thread.currentThread().getName());
	}
}

class CalcularCuadrado extends Thread {

	public double resultado = 0;
	private int dato;

	CalcularCuadrado(String nombre, int numero) {
		super(nombre);
		dato = numero;
		setPriority(Thread.MAX_PRIORITY);
		start();
	}

	public void run() {
		System.out.println("Comienza hilo " + Thread.currentThread().getName());
		resultado = dato * dato;
		System.out.println("Cuadrado de " + dato + "= " + resultado);
		System.out.println("Acaba hilo " + Thread.currentThread().getName());
	}
}

public class Ejercicio1 {

	public static void main(String args[]) {
		int n = 4;

		CalcularFactorial cf = new CalcularFactorial("CalcFactorial", n);
		CalcularRaizCuadrada cr = new CalcularRaizCuadrada("CalcRaiz", n);
		CalcularCuadrado cc = new CalcularCuadrado("CalcCuadrado", n);

		Thread.currentThread().setName("hilo principal");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		

		System.out.println("Comienza " + Thread.currentThread().getName());
		System.out.println("\nSuma de los tres valores: " + (cf.resultado + cr.resultado + cc.resultado));
		System.out.println("Acaba " + Thread.currentThread().getName());
	}
}
