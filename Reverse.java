/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse 
{
	public static void main (String[] args)
	{
		String str = args[0];
		String revStr = "";
		int i = str.length() - 1;
		while (i > (-1))
		/*What? not good
		you should have use for(int i = str.length()-1; i >= 0; i--)
		*/
		{
			revStr = revStr + str.charAt(i);
			i--;
		}
		System.out.println(revStr);
		char mid = str.charAt((str.length() - 1) / 2);
		System.out.println("The middle character is " + mid);
	}
}
