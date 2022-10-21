import java.io.*;
public class ExecEj1_6 {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
        String comando = "java Ej1_6";
        Process p = null;
        try{
            //escritura  --  envia  entrada  a  DATE
            p = r.exec(comando); 

            InputStream is = p .getInputStream();
            BufferedReader br = new BufferedReader 
            (new InputStreamReader(is));
            String linea;
            while((linea = br.readLine())!=null)
            System.out.println(linea); 
            br.close();
        }        
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
