
public class SacarDinero extends Thread{
    private Cuenta cuenta;
    private String nombre;

    SacarDinero(Cuenta c,String nombre){
        super(nombre);
        this.cuenta = c;
        this.nombre = nombre;
    }

    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    public void run(){
        for(int i = 0;i < 4;i++){
            this.cuenta.RetirarDinero(10, this.nombre);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
}
