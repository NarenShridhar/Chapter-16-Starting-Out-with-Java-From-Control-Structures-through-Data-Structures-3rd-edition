import java.util.Scanner;

public class Chapter16Problem7
{
	public static void main (String[] args)
	{
		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		int userNumber;

		int exponentNumber;

		System.out.println("User, enter a number: ");
		userNumber = keyboard.nextInt();

		System.out.println("User, enter an exponent number: ");
		exponentNumber = keyboard.nextInt();

		System.out.println("The total of " + userNumber + " raised to the " + exponentNumber + "th power is: " 
			+ recursivePowerMethod(userNumber, exponentNumber));
	}
	
	public static int recursivePowerMethod(int number, int exponent)
	{
		int total = 0;

		if(exponent == 0)
		{
			return 1;
		}

		else if(exponent == 1)
		{
			return number;
		}

		else
		{
			total = number * recursivePowerMethod(number, exponent - 1);
			return total;
		}
	}
}