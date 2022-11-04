
public class FactorialHilos{
	public double calculoFactorial(int numero){
		double factorial=1;
		for(int i=1;i<=numero;i++)
			factorial*=i;
		return factorial;
	}
}