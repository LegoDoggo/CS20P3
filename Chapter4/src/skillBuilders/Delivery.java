package skillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) 
	{
		//Introduce user
		System.out.println("Delivery (Package size validator)");
		System.out.println("");
		
		//Get length, width, and height of package
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of your package: ");
		int length = input.nextInt();
		System.out.print("Enter the width of your package: ");
		int width = input.nextInt();
		System.out.print("Enter the height of your package: ");
		int height = input.nextInt();
		
		//Check dimensions and reject or accept
		if (length + width + height <= 10)
		{
			System.out.print("Accepted");
		}
		
		else
		{
			System.out.print("Declined");
		}

	}

}
