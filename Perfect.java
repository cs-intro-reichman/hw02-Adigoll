/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int i = 2;
		int sum = 1;
		String str = x + " is a perfect number since " + x + " = 1";
		while (i < x)
		{
			if (x % i == 0)
			{
				sum = sum + i;
				str = str + " + " + i;

			}
			i++;
		}
		if (sum == x)
		{
			System.out.print(str);
		}
		else
		{
			System.out.println(x + " is not a perfect number");
		}
	}
}
