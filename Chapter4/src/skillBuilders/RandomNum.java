package skillBuilders;
import java.util.Scanner;
import java.lang.Math;

public class RandomNum {

	public static void main(String[] args) 
	{
		//Introduce user
		System.out.println("Random Number Generator");
		System.out.println("");
		
		//Get min max values
		Scanner input = new Scanner(System.in);
		System.out.print("MINIMUM value for generation: ");
		int minVal = input.nextInt();
		System.out.print("MAXIMUM value for generation: ");
		int maxVal = input.nextInt();
		
		//Generate and display random number
		int randomInteger = (int)(Math.random() * (maxVal - minVal + 1) + minVal);
		System.out.print("Your random number is: " + randomInteger);
	}

}
