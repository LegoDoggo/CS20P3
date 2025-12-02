package mastery;

/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

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

Paste the output of your code here
 
 */