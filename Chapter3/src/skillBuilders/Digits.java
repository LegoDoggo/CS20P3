package skillBuilders;

import java.util.Scanner;

class Digits {

	public static void main(String[] args)
	{
		//Get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a two digit number: ");
		int userNum = input.nextInt();
		
		//Separate the number into 2
        int tens = userNum / 10;
        int ones = userNum % 10;
		
        System.out.println("Ones-place digit: " + ones);
        System.out.println("Tens-place digit: " + tens);
	}

}
