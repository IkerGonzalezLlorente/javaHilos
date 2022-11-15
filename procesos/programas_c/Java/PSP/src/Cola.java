public  class Cola  {
    private  int numero;
    private boolean disponible =  false;//inicialmente  cola vacia
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
    