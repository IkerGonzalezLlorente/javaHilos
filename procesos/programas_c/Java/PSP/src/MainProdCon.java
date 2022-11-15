public class MainProdCon {
    public static void main(String[] args) {
        Cola c = new Cola();
        Productorc prod = new Productorc(c, 1,"prod 1");
        Consumidorc cons = new Consumidorc(c, 1,"cons 1");
        Productorc prod2 = new Productorc(c, 1,"prod 2");
        Consumidorc cons2 = new Consumidorc(c, 1,"cons 2");
        Productorc prod3 = new Productorc(c, 1,"prod 3");
        Consumidorc cons3 = new Consumidorc(c, 1,"cons 3");


        // * De primeras se ha solucionado añadiendo sincronizaciones a todos los metodos de cola y añadiendo un sleep(100) al metodo de consumicion
        // * Falla en ejecuciones largas
        // * Hay que hacer que get espere a que put termine ¿wait() notify()?
        // * Se ha solicionado con wait() notify() en la clase Cola 
        prod.start();
        cons.start();
        prod2.start();
        cons2.start();
        prod3.start();
        cons3.start();

    }
}
