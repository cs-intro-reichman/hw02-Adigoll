/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int i;
		int j;
		for (i = 0; i < x; i++)
		{
			for (j = 0; j < x; j++)
			{
				if (i % 2 == 0)
				{
					if (j == (x - 1))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("* ");
					}
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
