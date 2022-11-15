public class MainSacarDinero {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cuenta c = new Cuenta(50);
        SacarDinero h1 = new SacarDinero(c,"Iker");
        SacarDinero h2 = new SacarDinero(c,"Victor");
        SacarDinero h3 = new SacarDinero(c,"Maria");
        SacarDinero h5 = new SacarDinero(c,"Ana");
        SacarDinero h6 = new SacarDinero(c,"Marcos");
        SacarDinero h4 = new SacarDinero(c,"Juan");
        
        h1.start();
        h2.start();
        h3.start();
        h6.start();
        h4.start();
        h5.start();
    }
}
