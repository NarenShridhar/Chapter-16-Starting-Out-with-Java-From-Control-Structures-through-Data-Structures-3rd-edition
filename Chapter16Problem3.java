import java.util.Scanner;

public class Chapter16Problem3
{
	public static void main (String[] args)
	{
		// Created a String variable called userString to hold the String given from the user.
		String userString;

^

		// Get the word from the user and store it in userString.
		System.out.println("User, please enter a word to have reversed: ");
		userString = keyboard.nextLine();

		System.out.println("The word " + userString + " reversed is: ");
		reverseString(userString, userString.length() - 1);

		System.out.println();
	}

	// Created a void method called reverseString to recursively display the String that was given.
	public static void reverseString(String string, int size)
	{
		if(size >= 0)
		{
			System.out.print(string.charAt(size));
			reverseString(string, size - 1);
		}
	}
}