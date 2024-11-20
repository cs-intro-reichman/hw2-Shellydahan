// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt( args[0]);
		String vc =(args[1]);
		int seed=1;
		for(int i=1;i<=N;i++)
		{
		seed=i;
		int runs=1;
		boolean done= false;
		while (!done) 
		{
		if(vc.equals("v"))
		{
		  System.out.print(seed + " ");
		}
          if(seed%2==0)
		     seed=seed/2;
		  else
		      seed= (seed*3) +1;
		  if(seed==1)
		    done=true;
		runs++;
		}
		if(vc.equals("v"))
		  System.out.println("1 "+ "("+ runs+ ")");
	   }
	System.out.println("Every one of the first "+ N +" hailstone sequences reached 1.");
	}

	
	}
	

