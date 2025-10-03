package skillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) 
	{
		//Starting variables
		int startCount = 1;
		int sumAccumulator = 0;
		int oddNum = 0;
		
		//Prompt for input
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int userInt = input.nextInt();
		
		//Display all the odd numbers
		while (startCount <= userInt)
		{
			int oddOrNot = startCount % 2;
					
					if (oddOrNot == 1)
					{
						oddNum = startCount;
						sumAccumulator += oddNum;
						System.out.println(oddNum);
					}

			startCount++;
		}
		
		//Display the sum of the odds
		System.out.println(sumAccumulator);
		

	}

}
