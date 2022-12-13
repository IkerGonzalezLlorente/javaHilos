public  class Cola  {
    private String [] consumidoresAlaEspera = new String[Consumidorc.n];
    private int []  cola;
    
    private int tamanoCola;
    private  int numero;
    private boolean disponible =  false;//inicialmente  cola vacia
    public Cola(int n){
        this.tamanoCola = n;        
    }

    public int[] getCola() {
        return this.cola;
    }

    public void setCola(int[] cola) {
        this.cola = cola;
    }

    public int getTamano(){
        return this.tamanoCola;
    }
    public void setTamano(int n){
        this.tamanoCola = n;
    }

    synchronized public int get() throws InterruptedException  {
    while(!disponible){
        wait();
    }
    if(disponible)  {  //hay numero en la cola 
    disponible=false;  //pse pone cola vacia
    notifyAll();
    return numero;  //se devuelve
    }
    return -1;  //no hay numero disponible,  cola vacia
    }
    synchronized public void put(int valor) throws InterruptedException  {
    while(disponible){
        wait();
    }
    numero = valor;  //coloca valor en la  cola 
    disponible=true;  //disponible para consumir,  cola  llena
    notifyAll();
    }
    }
    