public class Productorc extends Thread {
    private Cola cola; 
    private  int n;

    public Productorc(Cola c,  int n, String no)  { 
        super(no);
        cola = c; 
        this.n = n;
    }

    
    public void run()  {
    for  (int  i=  0;  i <  21;  i++)  {
    try {
        cola.put(i);
    } catch (InterruptedException e1) {
        e1.printStackTrace();
    }  //pone el número
    System.out.println(Thread.currentThread().getName()+
     ",  produce: "  +  i);
    try  {
    sleep (100) ;
    // notify();
    }  catch  (InterruptedException e)  {  }
    }
    }
}
  