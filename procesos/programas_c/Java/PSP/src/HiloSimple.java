import java.io.*;
public class HiloSimple extends Thread  { 
    public void run()  {
        for  (int  i=0;  i<5;i++)
        System.out.println("En el Hilo...  ");
        }
}