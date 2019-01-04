public class Chapter16Problem8
{
	public static void main (String[] args)
	{
		System.out.println("The sum of 12 plus all the numbers before it is: " + sum(12));
	}

	public static int sum(int number)
	{
		if(number == 0)
		{
			return 0;
		}

		else if(number == 1)
		{
			return 1;
		}

		else
		{
			return number + sum(number - 1);
		}
	}
}