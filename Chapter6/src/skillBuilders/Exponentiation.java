package skillBuilders;

import java.util.Scanner;

public class Exponentiation {

	//Method for getting the power
	public static double powerOf(double userNum, double exponent)
	{
		//Calculate answer
		double answer = Math.pow(userNum, exponent);
		
		//Send the answer to main
		return(answer);
	}
	
	//Method for getting input and displaying returned value
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Get input
		System.out.println("Enter the number: ");
		double userNum = input.nextDouble();
		System.out.println("Enter the exponent: ");
		double exponent = input.nextDouble();
		
		//Get and display answer
		double returnedAns = powerOf(userNum, exponent);
		System.out.println(userNum + " raised to the power of " + exponent + " is equal to " + returnedAns);
		

	}

}
