import java.io.*;

public class Ej1_6 {
    /**
     * @param args
     * @throws IOException
     */
        public static void main (String[] args){
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String num1,num2;
            try{
                  System.out.print("Introduce un número: ");
                  num1 = br.readLine();
                  System.out.print("Introduce otro número: ");
                  num2 = br.readLine();
                  System.out.println("La suma de los números es: " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
            }
            catch (Exception e) {
                  e.printStackTrace();
              }
      }

    }
