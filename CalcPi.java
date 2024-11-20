// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int terms = Integer.parseInt( args[0]);
		double sum=1.0;
		double times=3.0;
		for(int i=1; i<terms; i++)
		{
		  if(i%2 == 0)
		    sum= sum + (1.0/times);
		  else
		      sum= sum - (1.0/times);
		  times=times+2;
		}
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     "+ sum*4);
	}
}