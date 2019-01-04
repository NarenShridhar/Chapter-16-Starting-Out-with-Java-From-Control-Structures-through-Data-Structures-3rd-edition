import java.util.Scanner;

public class Chapter16Problem5
{
	public static void main (String[] args)
	{
		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a String array called array, with a field size to be gotten from the user. 
		String[] array;

		// Created an integer variable called userNumber to hold the number of String input's the user wants to have in the array.
		int userNumber;

		// Print an empty line for formatting.
		System.out.println();
		
		// Get the String array size from the user. 
		System.out.println("User, how many Strings do you want to have: ");
		userNumber = keyboard.nextInt();

		// Set the String array size.
		array = new String[userNumber];

		// Print an empty line for formatting.
		System.out.println();

		// For loop sets each array element based on what the user inputs. 
		for(int i = 0; i < array.length; i++)
		{
			// Ask the user to enter a String for each element of the array
			System.out.println("User, please enter String " + (i + 1));

			if(i == 0)
			{
				// Make sure to print this next line, or else the program will not function.
				keyboard.nextLine();

				// Store each user input into each respective element field. 
				array[i] = keyboard.nextLine();
			}

			else
			{
				// Store each user input into each respective element field. 
				array[i] = keyboard.nextLine();
			}
		} 

		// Print an empty line for formatting.
		System.out.println();

		System.out.println("User, you entered: ");

		// Now show the user what they entered to make sure they are happy.
		for(int i = 0; i < array.length; i++)
		{
			// Print the user's input
			System.out.print("String " + (i + 1) + ": " + array[i] + "\n");
		}

		// Print an empty line for formatting.
		System.out.println();

		// For loop runs as long as there are more array elements. 
		for(int i = 0; i < array.length; i ++)
		{
			System.out.print(array[i]);
			{
				if(palindromeDetector(stripString(array[i])))
				{
					System.out.println(" is a palindrome");
				}

				else
				{
					System.out.println(" is NOT a palindrome");
				}
			}
		}

		// Print an empty line for formatting.
		System.out.println();


	}

	/*
		The stringString method is used to convert the alphabets in a given string argument to uppercase, while stripping
		all non-letters from the string. This serves the function of setting all characters in a string to the same case
		(which is essential for comparing palindromes), as well as removing empty spaces that will not always mirror
		one another (also essential for comparing palindromes).
		The @param is used to strip the String that is given. 
		The @return returns the String that was given with all uppercase letters, and stripped of all non-letters. 
	*/

	public static String stripString(String stringStrip)
	{
		/*
			This statement converts the stringStrip argument given, to an all uppercase version of the same argument. 
			It is important to remember that the toUpperCase method being used here is actually a Character class method. 
			Remember, the Character class includes many useful static method for dealing with char variables including, 
			isDigit(), isLetter(), isWhiteSpace(), and the one being used here, toUpperCase().
		*/
		stringStrip = stringStrip.toUpperCase();

		/*
			Created a String variable called stripped. This variable is what is returned from this method. 
			I have initialized the value of this variable as an empty string so that it can be filled in later using
			an Add AND assignment operator. 
		*/

		String stripped = "";

		// Use a for loop to read the string for letters
		for(int i = 0; i < stringStrip.length(); i++)
		{
			/*
				Here I have used another useful Character class method, the isLetter() method, in order for the method
				to determine whether either index of the stringStrip String is a letter, as the loop increments. 
				This method will remove all the white spaces, commas, special operaters, etc, that are not letters, 
				leaving a clean String to be analyzed by the palindromeDetector method. 
			*/

			if(Character.isLetter(stringStrip.charAt(i)))
			{
				// If the character at each index is a letter, store it using an Add AND assignment operator, to the stripped variable.
				stripped += stringStrip.charAt(i);
			}
		}

		// Return the stripped String. 
		return stripped;
	}

	/*
		The palindromeDetector method determines whether or not a string is a palindrome (meaning it is the same both forwards
		and backwards). 
		The @param stringGiven is the string to test. 
		The @return for this method (boolean), returns true if the String is a palindrome, and false if it is not. 
	*/
	public static boolean palindromeDetector(String stringGiven)
	{
		/*
			Created a boolean variable called status, and initialized it as false. If the method finds that a palindrome
			exists, then this variable will be changed to true in the later step. 
		*/

		boolean status = false;

		/*
			The Base Case, when the length of the string is less than or equal to 1, the status will be changed to true, 
			because for the program to have run this far, it means everything before it matches the qualifications
			of a String that is a palindrome. 
		*/

		if(stringGiven.length() <= 1)
		{
			status = true;
		}

		// Recursive case that tests if the entirety of the String is a palindrome, by recursively calling the method. 
		else if(stringGiven.charAt(0) == stringGiven.charAt(stringGiven.length() - 1))
		{
			/*
				Used the substring method here. In this example, the substring outputs the elements beginning from the 
				incremented index of 1, to the length of the string arugment - 1. 

				I did some research on using the substring method as I have never used it before. Hopefully my understanding
				is sufficient for now, and I should do more research on incorporating the method in the future. 
			*/
			status = palindromeDetector(stringGiven.substring(1, stringGiven.length() - 1));
		}

		// Return statement returns the status of the palindrome, either true or false. 
		return status;
	}
}