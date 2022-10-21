
import java.io.IOException;
import java.lang.*;
import java.util.Scanner;
class Prueba{
    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception, IOException{
        try{
            Runtime data = Runtime.getRuntime();
            Process proceso_hijo = data.exec("echo \"Hola mundo!\"");
        }
        catch(IOException e){
            System.out.println("patata");
        }
    }
}

// Para ejecutar un proceso hijo del actual ejecutado por el programa r.exec("comando") asignado a un objeto de tipo Process