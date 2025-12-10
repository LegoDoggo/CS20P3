package mastery;
import java.util.Scanner;

public class Coder {

	public static void main(String[] args) 
	{
		//Initializations
		char[] stringLetters;
		String encodedString = "";
		Scanner input = new Scanner(System.in);
		
		//Introduction
		System.out.println("Coder");
		System.out.println("");
		
		//Prompt user for string
		System.out.print("Enter a string: ");
		String toBeEncoded = input.nextLine();
		
		//Turn string into char array
		stringLetters = toBeEncoded.toCharArray();
		for (int letter = 0; letter < stringLetters.length; letter++) 
		{
			//If statement will run nothing if the character is non alphabetic
			if (!((stringLetters[letter] >= 'A' && stringLetters[letter] <= 'Z') ||(stringLetters[letter] >= 'a' && stringLetters[letter] <= 'z')))
			{
				//Character is non alphabetic - do nothing
			}
			
			else
			{
				char checkWrap = stringLetters[letter];

				// Uppercase wrap
				if (checkWrap == 'Y') 
				{
				    stringLetters[letter] = 'A';
				}
				
				else if (checkWrap == 'Z') 
				{
				    stringLetters[letter] = 'B';
				}

				// Lowercase wrap
				else if (checkWrap == 'y') 
				{
				    stringLetters[letter] = 'a';
				}
				
				else if (checkWrap == 'z') 
				{
				    stringLetters[letter] = 'b';
				}
				
				else
				{
					//Add 2 to unicode value of letters
					stringLetters[letter] += 2;
				}
			}
		}
		
		//Build the coded letters into a string
        for (int i = 0; i < stringLetters.length; i++)
        {
            encodedString = encodedString + stringLetters[i];
        }
        
		//Print encoded message
		System.out.println("Encoded message: " + encodedString);
	}

}
