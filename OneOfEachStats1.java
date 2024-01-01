/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 
{
	public static void main (String[] args) 
	{
		int T = Integer.parseInt(args[0]);
		int i;
		int twoKids = 0;
		int threeKids = 0;
		int fourKids = 0;
		int sumKids = 0;
		double totallSum = 0;
		boolean isBoy = false;
		boolean isGirl = false;
		int kid;
		int max;
		for (i = 0; i < T; i++)
		{
			while (!isGirl || !isBoy)
			{
				kid = (int)(Math.random() * 2);
				if (kid == 1)
				{
					System.out.print("g ");
					isGirl = true;
				}
				else
				{
					System.out.print("b ");
					isBoy = true;
				}
				sumKids++;
				totallSum++;
			}
			System.out.println(sumKids);
			if (sumKids == 2)
				twoKids++;
			if (sumKids == 3)
				threeKids++;
			if (sumKids >= 4)
				fourKids++;
			isBoy = false;
			isGirl = false;
			sumKids = 0;
		}
		System.out.println("Average: " + (totallSum / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoKids);
		System.out.println("Number of families with 3 children: " + threeKids);
		System.out.println("Number of families with 4 or more children: " + fourKids);
		max = Math.max(Math.max(twoKids, threeKids), fourKids);
		if (max == twoKids)
			System.out.println("The most common number of children is 2.");
		else
		{
			if (max == threeKids)
				System.out.println("The most common number of children is 3.");
			else
			{
				if (max == fourKids)
					System.out.println("The most common number of children is 4 or more.");
			}
		}
	}
}
