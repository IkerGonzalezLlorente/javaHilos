#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>

void manejador(int segnal) {
    printf("Hijo recibe  señal.. %d\n",  segnal);
}

int main () {
    int contador = 0;
    int  pid_hijo ;
    pid_hijo =fork();
    switch(pid_hijo){
    case -1:
        printf(  "Error al  crear el proceso hijo...\n"); 
        exit(-1);
        break; 
    case 0:  //HIJO
        signal(SIGUSR1,  manejador);  //MANEJADOR DE  SEÑAL EN HIJO 
        while(contador <= 10){
            printf("%d",contador);
            contador++;
            sleep(1);
        };
    break;
    default:  //PADRE envia 2  señales 
         sleep(1);
         kill(pid_hijo,  SIGUSR1);//ENVIA SEÑAL AL HIJO 
         sleep(1);
         kill (pid_hijo,  SIGUSR1) ;//ENVIA SEÑAL AL HIJO 
         sleep (1); 
         break;
    }
    return  0;
}