public class Consumidorc extends Thread  {
    private Cola cola; 
    public static int n;
    public Consumidorc(Cola c,  int n, String no)  {
        super(no); 
        cola = c; 
        n++;
    }
    public void run()  {
    int valor =  0;
    for  (int  i =  0;  i <  21;  i++)  {       
        try {
            valor = cola.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  //recoge el número
        System.out.println(Thread.currentThread().getName()+
        ",  consume:  "  + valor);
        }
        }
    }
    
