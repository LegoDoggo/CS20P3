/*

Program: MySavings.java          Last Date of this Revision: November 26, 2025

Purpose: An application that uses an object called PiggyBank to manage coins.

Author: Easton Seeley 
School: CHHS
Course: Computer Science 20
 

*/

package mastery;
import java.util.Scanner;

public class MySavings {

	public static void main(String[] args) 
	{
		//Create a bank object
		PiggyBank myBank = new PiggyBank();
		
		//Make quit variable
		boolean binaryQuit = false;
		
		//Loop until user quits program
		while (binaryQuit == false)
		{
			//Show user options
			System.out.println("1. Show total in bank.");
			System.out.println("2. Add a penny.");
			System.out.println("3. Add a nickel.");
			System.out.println("4. Add a dime.");
			System.out.println("5. Add a quarter.");
			System.out.println("6. Take money out of bank.");
			System.out.println("Enter 0 to quit");
			
			//Get user decision
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your choice: ");
			int choice = input.nextInt();
			
			switch (choice)
			{
				case 0:
					binaryQuit = true;
					break;
				
				case 1:
					System.out.println(myBank);
					break;
					
				case 2:
					myBank.addMoney(choice);
					break;
					
				case 3:
					myBank.addMoney(choice);
					break;
					
				case 4:
					myBank.addMoney(choice);
					break;
					
				case 5:
					myBank.addMoney(choice);
					break;
					
				case 6:
					System.out.println("Penny = 1");
					System.out.println("Nickel = 2");
					System.out.println("Dime = 3");
					System.out.println("Quarter = 4");
					System.out.print("What type of coin would you like to remove?: ");
					int monTa = input.nextInt();
					myBank.takeMoney(monTa);
					break;
			}
		
		}
	}

}

/* Screen Dump

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 2
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 5
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 1
You have $0.26
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 6
Penny = 1
Nickel = 2
Dime = 3
Quarter = 4
What type of coin would you like to remove?: 3
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 1
You have $0.16
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 0
 
 */
