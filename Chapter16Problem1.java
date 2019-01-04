import java.util.Scanner;

public class Chapter16Problem1
{
	public static void main (String[] args)
	{
		// Created an integer variable called userNumberX to hold the x input of the user.
		int userNumberX; 

		// Created an integer variable called userNumber Y to hold the y input of the user.
		int userNumberY;

		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a char variable called repeat to determine if the user wants to re-enter new numbers.
		char repeat = 'Y';

		// While the user wants to repeat the program, repeat it.
		while(repeat == 'y' || repeat == 'Y')
		{
			// Get the value for X.
			System.out.println("User, enter a value for X: ");
			userNumberX = keyboard.nextInt();

			// Get the value for y.
			System.out.println("User, enter a value for Y: ");
			userNumberY = keyboard.nextInt();

			// Display the results.
			System.out.println("The product of " + userNumberX + " and " + userNumberY + " is: " + RecursiveMultiplication(userNumberX, userNumberY));

			// Consume the next line.
			keyboard.nextLine();

			// Determine if the user wants to repeat the program.
			System.out.println("Do you want to enter new number?");
			System.out.println("Enter 'Y' or 'N'");
			repeat = keyboard.nextLine().charAt(0);
		}
	}

	/*
		Created the RecursiveMultiplication method to solve this problem recursively. 
		Note, the only problem with this program is that it does not have an answer for mulitiplication with negative numbers. 
		Notice, if a negative number is input, there is no base case for it, so it will be directed to the recursive case. 
		This means that there will be an error since the negative number as X cannot be decrement by 1 and still function.
		This error only appears when the negative number is in the X position, not the Y, because the Y never decrements recursively.
	*/

	public static int RecursiveMultiplication(int x, int y)
	{
		// Base Case, if x is 0 or y is 0, the product is always 0.
		if(x == 0 || y == 0)
		{
			return 0;
		}

		// Base Case, if x is 1, the product is always y.
		else if(x == 1)
		{
			return y;
		}

		// Recursive Case, if x is greater than 1, return y + y + y + y... etc, with the amount of additions being equals to x.
		else
		{
			return y + RecursiveMultiplication(x - 1, y);
		}
	}
}