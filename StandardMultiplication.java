import java.util.Scanner;

public class StandardMultiplication
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
			System.out.println("The product of " + userNumberX + " and " + userNumberY + " is: " + StandardMultiplication(userNumberX, userNumberY));

			// Consume the next line.
			keyboard.nextLine();

			// Determine if the user wants to repeat the program.
			System.out.println("Do you want to enter new number?");
			System.out.println("Enter 'Y' or 'N'");
			repeat = keyboard.nextLine().charAt(0);
		}
	}

	// Created the StandardMultiplication method to solve this program iteratively.
	public static int StandardMultiplication(int x, int y)
	{
		return x * y;
	}
}