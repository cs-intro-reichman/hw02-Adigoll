
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach 
{
	public static void main (String[] args) 
	{
		boolean isBoy = false;
		boolean isGirl = false;
		int x;
		while (!isGirl || !isBoy)
		{
			x = (int)(Math.random() * 2);
			if (x == 1)
			{
				System.out.print("g ");
				isGirl = true;
			}
			else
			{
				System.out.print("b ");
				isBoy = true;
			}
		}
		
	}
}
