import java.util.Scanner;

public class Chapter16Problem6
{
	public static void main (String[] args)
	{
		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a char array called array, with a field size to be gotten from the user. 
		char[] array;

		// Created an integer variable called userNumber to hold the number of char input's the user wants to have in the array.
		int userNumber;

		// Created a character variable search to hold the character the user is searching for
		char search;
		
		// Created an integer variable called count to hold the number of times the chosen character shows up in the char array.
		int count;

		// Created a char variable repeat to ask to user if they want to search for another value
		char repeat = 'Y';

		/*
			Created an integer variable called position to hold the current position in the array. 
			Note that the position is initialized to 0, because the starting element of the array is always 0. 
		*/

		int position = 0;

		// Get the char array size from the user. 
		System.out.println("User, how many characters do you want to have: ");
		userNumber = keyboard.nextInt();

		// Set the char array size.
		array = new char[userNumber];

		// Print an empty line for formatting.
		System.out.println();

		// For loop sets each array element based on what the user inputs. 
		for(int i = 0; i < array.length; i++)
		{
			// Ask the user to enter a char for each element of the array
			System.out.println("User, please enter character: " + (i + 1));

			if(i == 0)
			{
				// Make sure to print this next line, or else the program will not function.
				keyboard.nextLine();

				// Store each user input into each respective element field. 
				array[i] = keyboard.nextLine().charAt(0);
			}

			else
			{
				// Store each user input into each respective element field. 
				array[i] = keyboard.nextLine().charAt(0);
			}
		} 

		// Print an empty line for formatting.
		System.out.println();

		System.out.println("User, you entered: ");

		// Now show the user what they entered to make sure they are happy.
		for(int i = 0; i < array.length; i++)
		{
			// Print the user's input
			System.out.print("Character " + (i + 1) + ": " + array[i] + "\n");
		}

		// Print an empty line for formatting.
		System.out.println();

		while(repeat == 'y' || repeat == 'Y')
		{
			// Enter a character to search for.
			System.out.println("User, enter a character to search for: ");
			search = keyboard.nextLine().charAt(0);

			// Function call.
			count = countOccurences(array, search, position);

			// Output the character count
			System.out.println("The amount of times " + search + " appears in the characters you entered is: " + count);

			System.out.println("User, do you want to search for another letter? Enter 'Y' or 'N'");
			repeat = keyboard.nextLine().charAt(0);
		}
	}

	/*
		The countOccurences class is used to determine the number of times a specific characters appears within an 
		array of characters. 
		The first @param is the char array that will be searched.
		The second @param is the character to be searched for, 'a', 'm', 'z', etc...
		The third @param is the position within the array, that will increment after each search of an array element.
	*/

	public static int countOccurences(char[] array, char search, int position)
	{
		if(position < array.length)
		{
			if(array[position] == search)
			{
				return (1 + countOccurences(array, search, position + 1));
			}

			else
			{
				return countOccurences(array, search, position + 1);
			}
		}

		else
		{
			return 0;
		}
	}
}