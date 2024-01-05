/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors 
{
	public static void main (String[] args) 
	{
		//Gets a number
		int x = Integer.parseInt(args[0]);
		int i = 1;
		// A loop that checks the devisors of the number from 1 to the number itself
		while (i <= x)
		{	
			//If the number devided by i, print i (a divisor)
			if ((x % i) == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		/* you should have used a for loop and not while,
		when we need to run a finite number of iterations like n, we use for */
		
	}
}
