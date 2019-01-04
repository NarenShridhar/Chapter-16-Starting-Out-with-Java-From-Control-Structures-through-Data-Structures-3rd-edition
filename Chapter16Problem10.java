import java.util.Scanner;

public class Chapter16Problem10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double startingPopulation;

		double dailyIncrease;

		int numDays;

		int alsoDays;

		double dailyIncreaseNumber;

		System.out.println("User, enter a starting population");
		startingPopulation = keyboard.nextDouble();

		System.out.println("User, enter a daily Increase");
		dailyIncrease = keyboard.nextDouble();

		dailyIncreaseNumber = dailyIncrease/100;

		System.out.println("User, enter a number of days: ");
		numDays = keyboard.nextInt();

		alsoDays = numDays;

		for(int day = 0; day <= alsoDays; day++)
		{
			System.out.println(calculatePopulation(startingPopulation, dailyIncreaseNumber, numDays));
		}

		System.out.println(calculatePopulation(startingPopulation, dailyIncreaseNumber, 0));
		System.out.println(calculatePopulation(startingPopulation, dailyIncreaseNumber, 1));
		System.out.println(calculatePopulation(startingPopulation, dailyIncreaseNumber, 2));
		System.out.println(calculatePopulation(startingPopulation, dailyIncreaseNumber, 3));
		System.out.println(calculatePopulation(startingPopulation, dailyIncreaseNumber, 4));

	}

	public static double calculatePopulation(double startingPopulation, double dailyIncrease, int numDays)
	{

		if(numDays == 0)
		{
			return startingPopulation;
		}

		else
		{
			return (startingPopulation * dailyIncrease) + calculatePopulation(startingPopulation, dailyIncrease, numDays - 1);
		}
	}


}