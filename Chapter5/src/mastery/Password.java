package mastery;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	{
		//Initialize variable for loop
		int attempts = 0;
		
		//Prompt user to make password
		Scanner input = new Scanner(System.in);
		System.out.print("Create a password: ");
		String password = input.next();
		System.out.println("");
		
		//Prompt user for password
		while (attempts <= 3)
		{
			System.out.print("Enter the password: ");
			String userInput = input.next();
			
			if (userInput == password)
			{
				System.out.println("Welcome.");
			}
			
			else
			{
				
			}
		}
		
		

	}

}
