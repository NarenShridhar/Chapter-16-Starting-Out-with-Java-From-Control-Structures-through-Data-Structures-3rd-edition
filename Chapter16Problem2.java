import java.util.Scanner;

public class Chapter16Problem2
{
	// Created an integer array to test the isMember method on.
	public static int[] array = {1, 2, 3, 4, 5};

	public static void main (String[] args)
	{
		System.out.println(isMember(array, 0, 4, 6));
	}

	/*
		The isMember method performs a binary search on an integer array.
		The first @param is the array to search
		The second @param is the first element in the search range
		The third @param is the last element in the search range
		The fourth @param is the value to search for
		The @return statement returns true or false, if the value was found or not.
	*/

	public static boolean isMember(int[] array, int first, int last, int value)
	{
		// The mid-point of the search.
		int middle; 

		// Test for the base case where the value is not found.
		if(first > last)
		{
			return false;
		}

		// Calculate the middle position.
		middle = (first + last)/2;

		// Search for the value
		if(array[middle] == value)
		{
			return true;
		}

		else if(array[middle] < value)
		{
			return isMember(array, middle + 1, last, value);
		}

		else
		{
			return isMember(array, first, middle - 1, value);
		}
	}
}