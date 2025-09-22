package skillBuilders;
import java.util.Scanner;
import java.lang.Math;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		//Introduce user
		System.out.println("Perfect Square Detector");
		System.out.println("");
		
		//Get integer
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int userInt = input.nextInt();
		
		//Calculate whether number is perfect square
		int sqrtInt = (int) Math.sqrt(userInt);
		sqrtInt *= sqrtInt;
		
		if (sqrtInt == userInt)
		{
			System.out.print("Your number is a perfect square.");
		}
		
		else
		{
			System.out.print("Your number is not perfect square.");
		}
		
		

	}

}
