import java.io.*;
import java.lang.*;
class Iker{
    public static void main(String[] args)throws Exception, IOException{
        try{
            Runtime data = Runtime.getRuntime();
            Process proceso_hijo = data.exec("CMD /C DIR");
            InputStream is = proceso_hijo.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("patata");
        }
    }
}

// Para ejecutar un proceso hijo del actual ejecutado por el programa r.exec("comando") asignado a un objeto de tipo Process