public class IterativeGetMaxElement
{
	public static void main (String[] args)
	{
		int[] array = {1,5,10};

		int largest = array[0];

		for (int i = 0; i < array.length; i++)
		{
			if(array[i] > largest)
			{
				largest = array[i];
			}
		}

		System.out.println(largest);
	}

}