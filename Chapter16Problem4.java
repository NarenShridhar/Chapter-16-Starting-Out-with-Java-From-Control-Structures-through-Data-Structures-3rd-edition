public class Chapter16Problem4
{
	public static void main (String[] args)
	{
		int[] array = {1,2,93,34,65,76,107,8,10,12,15,0,11,20,74,20};
		int large;
		int position = 1;

		large = maxElement(array, array[0], position);

		System.out.println("Maximum element: " + large);
	}

	public static int maxElement(int[] array, int max, int position)
	{
		if(position < array.length)
		{
			if(array[position] > max)
			{
				max = array[position];
				return maxElement(array, max, position + 1);
			}

			else
			{
				return maxElement(array, max, position + 1);
			}
		}

		else
		{
			return max;
		}
	}
}