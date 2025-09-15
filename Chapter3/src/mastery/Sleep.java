package mastery;
import java.util.Scanner;

public class Sleep {

	public static void main(String[] args) 
	{
		//Initialize System Variables
		int sleepPerNight = 8;
		int daysInMonth = 30;
		int daysInYear = 365;
		
		//Intro
		System.out.println("Sleep Calculator");
		System.out.println("");
		
		//Get user birthday
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birthday: ");
		System.out.print("Year: ");
		int yearBirth = input.nextInt();
		System.out.print("Month: ");
		int monthBirth = input.nextInt();
		System.out.print("Day: ");
		int dayBirth = input.nextInt();
		
		//Get current day
		System.out.println("Enter the current date: ");
		System.out.print("Year: ");
		int yearCurrent = input.nextInt();
		System.out.print("Month: ");
		int monthCurrent = input.nextInt();
		System.out.print("Day: ");
		int dayCurrent = input.nextInt();
		
		//Calculate days alive
		int yearsAlive = yearCurrent - yearBirth;
		int daysInYrsAlive = yearsAlive * daysInYear;
		int monthsAlive = monthCurrent - monthBirth;
		int daysInMonthsAlive = monthsAlive * daysInMonth;
		int daysAlive = dayCurrent - dayBirth;
		int totalDaysAlive = daysInYrsAlive + daysInMonthsAlive + daysAlive;
		
		//Calculate hours slept
		int hoursSlept = totalDaysAlive * 8;
		
		//Display days alive and hours slept
		System.out.print("");
		System.out.println("Days alive: " + totalDaysAlive);
		System.out.print("Hours slept: " + hoursSlept);
	}

}
