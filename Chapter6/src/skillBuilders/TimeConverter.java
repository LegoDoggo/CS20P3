package skillBuilders;
import java.util.Scanner;

public class TimeConverter {
	
	public static void hoursToMinutes()
	{
		//Initialize necessary items
		double hours, minutes;
		Scanner input = new Scanner(System.in);
		
		//Get hours
		System.out.println("Enter the amount of hours: ");
		hours = input.nextDouble();
		
		//Convert to minutes
		minutes = hours * 60;
		System.out.println("There are " + minutes + " minutes in " + hours + " hours.");
	}
	
	public static void daysToHours()
	{
		//Initialize necessary items
		double days, hours;
		Scanner input = new Scanner(System.in);
		
		//Get days
		System.out.println("Enter the amount of days: ");
		days = input.nextDouble();
		
		//Convert to hours
		hours = days * 24;
		System.out.println("There are " + hours + " hours in " + days + " days.");
	}
	
	public static void minutesToHours()
	{
		//Initialize necessary items
		double minutes, hours;
		Scanner input = new Scanner(System.in);
		
		//Get minutes
		System.out.println("Enter the amount of minutes: ");
		minutes = input.nextDouble();
		
		//Convert to hours
		hours = minutes / 60;
		System.out.println("There are " + hours + " hours in " + minutes + " minutes.");
	}
	
	public static void hoursToDays()
	{
		//Initialize necessary items
		double hours, days;
		Scanner input = new Scanner(System.in);
		
		//Get hours
		System.out.println("Enter the amount of hours: ");
		hours = input.nextDouble();
		
		//Convert to days
		days = hours / 24;
		System.out.println("There are " + days + " days in " + hours + " hours.");
	}

	public static void main(String[] args) 
	{
		//Initialize necessary items
		int choice;
		Scanner input = new Scanner(System.in);
		
		//Ask user for desired conversion type
		System.out.println("Time Converter");
		System.out.println("");
		System.out.println("1. Hours to Minutes");
		System.out.println("2. Days to Hours");
		System.out.println("3. Minutes to Hours");
		System.out.println("4. Hours to Days");
		
		System.out.print("Choose conversion: ");
		choice = input.nextInt();
		
		//Redirect user to methods
		switch (choice)
		{
			case 1:
				hoursToMinutes();
				break;
				
			case 2:
				daysToHours();
				break;
				
			case 3:
				minutesToHours();
				break;
				
			case 4:
				hoursToDays();
				break;
		}
	}

}
