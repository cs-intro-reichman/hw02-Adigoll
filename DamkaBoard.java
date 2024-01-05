/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int i;
		int j;
		/* you are not supposed to define int i,j outside of the for 
		correct way: for( int i = 0;i < x; i++) for( int j=0;...) 
  		so that i and j are defined only within the scope of the for loops */
		for (i = 0; i < x; i++)
		{
			for (j = 0; j < x; j++)
			{
				if (i % 2 == 0)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
