package mastery;

/*

Program: LunchOrder.java          Last Date of this Revision: December 4th, 2025

Purpose: An application that allows the user to customize their lunch order and displays the nutritional info and price of the order.

Author: Easton Seeley 
School: CHHS
Course: Computer Science 20
 

*/

import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) 
	{
		//Food objects (contains food info)
		Food burger = new Food(1.85, 9.0, 33.0, 1.0, "hamburger");
		Food salad = new Food(2.00, 1.0, 11.0, 5.0, "salad");
		Food fries = new Food(1.30, 11.0, 36.0, 4.0, "french fries");
		Food soda = new Food(0.95, 0.0, 38.0, 0.0, "soda");
		
        //This object will store the total order price
        Food orderPrice = new Food();
		
		//Get user input, print all objects (name and nutritional info)
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of hamburgers: ");
		int numBurg = input.nextInt();
		System.out.println(burger);
		
		System.out.print("Enter number of salads: ");
		int numSal = input.nextInt();
		System.out.println(salad);
		
		System.out.print("Enter number of fries: ");
		int numFry = input.nextInt();
		System.out.println(fries);
		
		System.out.print("Enter number of sodas: ");
		int numSoda = input.nextInt();
		System.out.println(soda);
		

        //Calculate total
        orderPrice.calculatePrice(numBurg, numSal, numFry, numSoda, burger, salad, fries, soda);

		//Print order total price
		System.out.println("Your order comes to $" + orderPrice.getOPrice());
	}

}

/* Screen Dump

Enter number of hamburgers: 2
Each hamburger has 9.0g fat, 33.0g carbs, and 1.0g fiber.
Enter number of salads: 3
Each salad has 1.0g fat, 11.0g carbs, and 5.0g fiber.
Enter number of fries: 1
French fries have 11.0g fat, 36.0g carbs, and 4.0g fiber.
Enter number of sodas: 2
Each soda has 0.0g fat, 38.0g carbs, and 0.0g fiber.
Your order comes to $12.9

 
 */