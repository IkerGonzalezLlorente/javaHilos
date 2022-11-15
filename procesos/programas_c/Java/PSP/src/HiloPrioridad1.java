class HiloPrioridad1 extends Thread  {
    private  long c = 0;
    private boolean stopHilo = false;
    public long getContador()  {
    return this.c;
    }
    public void pararHilo()  { 
    this.stopHilo = true;
    }
    public void run() {
    while (!stopHilo){
        this.c++; 
    }  
    }
    }
