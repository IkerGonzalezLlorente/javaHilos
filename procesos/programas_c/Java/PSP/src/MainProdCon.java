public class MainProdCon {
    public static void main(String[] args) {
        Cola c = new Cola(6);

        Productorc prod = new Productorc(c, 1,"prod 1");
        Consumidorc cons = new Consumidorc(c, 1,"cons 1");
        Productorc prod2 = new Productorc(c, 1,"prod 2");
        Consumidorc cons2 = new Consumidorc(c, 1,"cons 2");
        Productorc prod3 = new Productorc(c, 1,"prod 3");
        Consumidorc cons3 = new Consumidorc(c, 1,"cons 3");
        Productorc prod4 = new Productorc(c, 1,"prod 4");
        Consumidorc cons4 = new Consumidorc(c, 1,"cons 4");
        Productorc prod5 = new Productorc(c, 1,"prod 5");
        Consumidorc cons5 = new Consumidorc(c, 1,"cons 5");
        Productorc prod6 = new Productorc(c, 1,"prod 6");
        Consumidorc cons6 = new Consumidorc(c, 1,"cons 6");
        Productorc prod7 = new Productorc(c, 1,"prod 7");
        Consumidorc cons7 = new Consumidorc(c, 1,"cons 7");

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
        prod4.start();
        cons4.start();
        prod5.start();
        cons5.start();
        prod6.start();
        cons6.start();
        prod7.start();
        cons7.start();

    }
}
