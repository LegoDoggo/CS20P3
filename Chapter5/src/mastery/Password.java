/*

Program: Password.java          Last Date of this Revision: October 29, 2025

Purpose: An application designed to store a password, and then prompt the user for the password for login. The program will determine whether the password is correct or not and whether to grant access to the user.

Author: Easton Seeley 
School: CHHS
Course: Computer Science 20
 

*/

package mastery;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	{
		//Initialize variable for loop
		int attempts = 0;
		boolean success = false;
		
		//Prompt user to make password
		Scanner input = new Scanner(System.in);
		System.out.print("Create a password: ");
		String password = input.next();
		System.out.println("");
		
		//Prompt user for password
		while (attempts < 3)
		{
			System.out.print("Enter the password: ");
			String userInput = input.next();
			
			if (userInput.equals(password))
			{
				System.out.println("Welcome.");
				success = true;
				break;
			}
			
			else
			{
				System.out.println("The password you typed is incorrect.");
				attempts ++;
			}
		}
		
		if (success == false)
		{
			System.out.println("Access denied.");
		}
		

	}

}

/* Screen Dump

Create a password: er2

Enter the password: er3
The password you typed is incorrect.
Enter the password: erf
The password you typed is incorrect.
Enter the password: er2
Welcome.

Create a password: per

Enter the password: ert
The password you typed is incorrect.
Enter the password: dfd
The password you typed is incorrect.
Enter the password: erty
The password you typed is incorrect.
Access denied.

 
 */
