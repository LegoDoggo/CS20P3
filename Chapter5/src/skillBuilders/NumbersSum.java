package skillBuilders;
import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) 
	{
		//Starting variables
		int startCount = 1;
		int sumAccumulator = 0;
		
		//Prompt for input
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int userInt = input.nextInt();
		
		//Display all the numbers
		while (startCount <= userInt)
		{
			System.out.println(startCount);
			sumAccumulator += startCount;
			startCount++;
		}
		
		//Display sum
		System.out.println("");
		System.out.print(sumAccumulator);
		
	}

}
