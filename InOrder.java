/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) 
{
		int r = (int)((Math.random()) * 10);
		int last = r;
		while (r >= last)
		{
			last = r;
			System.out.print(r + " ");
			r = (int)((Math.random()) * 10);
		}
	}
}
