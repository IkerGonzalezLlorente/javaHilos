public class Cuenta  {
    // * Parámetro estático que controla el saldo de la cuenta
     private  int saldo ;

    // Constructor 
    /**
     * @param s
     */
    Cuenta(int  s) {
        this.saldo =  s;
    }  //inicializa  saldo actual

    /**
     * @return
     */
    synchronized public int getSaldo() {
        return saldo;
    }  //devuelve el  saldo



    /**
     * @param cant
     */
    synchronized public void ingresar(int cant) {
        this.saldo = this.saldo + cant;
    }
    



    /**
     * @param cant
     * @param nom
     */
    synchronized void procesarOperacion(int cant, String nom){
        if  (getSaldo() >= cant) {
        System.out.println("SE VA A RETIRAR SALDO (ACTUAL ES:  " + getSaldo()+")");
            try  {
                Thread.sleep(500);
            }  
            catch (InterruptedException ex) {
                System.out.println("ERROR INESPERADO: " + ex.getMessage());
                return;
              }
            this.restar(cant);
            System.out.println(nom + " retira => " + cant + " ACTUAL(" + getSaldo() + ")" );
        }
        else{
                System.out.println("Cantidad insuficiente en cuenta:" + this.getSaldo());
        }
    }




    /**
     * @param cantidad
     */
    synchronized private void restar (int cantidad)
    {  //se resta la cantidad al saldo 
        this.saldo = this.saldo - cantidad ;
    }
    /**
     * @param cant
     * @param nom
     */
    public void RetirarDinero (int cant,  String nom) {
        this.procesarOperacion(cant, nom);
        if (getSaldo()  <  0) { 
            System.out.println("SALDO NEGATIVO =>  "  + getSaldo());
        }
    }
}