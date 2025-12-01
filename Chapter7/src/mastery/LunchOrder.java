package mastery;
import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) 
	{
		//Food objects (contains food info)
		Food burger = new Food(1.85, 9.0, 33.0, 1.0);
		Food salad = new Food(2.00, 1.0, 11.0, 5.0);
		Food fries = new Food(1.30, 11.0, 36.0, 4.0);
		Food soda = new Food(0.95, 0.0, 38.0, 0.0);
		
		//Get user input and print nutritional information
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of hamburgers: ");
		int numBurg = input.nextInt();
		System.out.println("");
		
		System.out.print("Enter number of salads: ");
		int numSal = input.nextInt();
		
		System.out.print("Enter number of fries: ");
		int numFry= input.nextInt();
		
		System.out.print("Enter number of sodas: ");
		int numSoda = input.nextInt();

	}

}
