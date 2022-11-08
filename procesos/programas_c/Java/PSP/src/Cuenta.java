public class Cuenta  {
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
    public int getSaldo() {
        return saldo;
    }  //devuelve el  saldo

    /**
     * @param cantidad
     */
    private void restar (int cantidad)
    {  //se resta la cantidad al saldo 
        this.saldo = this.saldo - cantidad ;
    }
    /**
     * @param cant
     * @param nom
     */
    synchronized public void RetirarDinero (int cant,  String nom) {
        if  (getSaldo()  >= cant) {
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
        else {
            System.out.println(nom + " No puede retirar dinero,  NO HAY  SALDO(" + getSaldo()+ ")" );
        }
        if (getSaldo()  <  0) { 
            System.out.println("SALDO NEGATIVO =>  "  + getSaldo());
        }
    }
}