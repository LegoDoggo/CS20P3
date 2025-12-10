package skillBuilders;
import java.util.Scanner;

public class CountLetters 
{
	public static void main(String[] args) 
	{
		final int LOW = 'A'; //smallest possible value
		final int HIGH = 'Z'; //highest possible value
		int[] letterCounts = new int[HIGH - LOW + 1];
		Scanner input = new Scanner(System.in);
		String word;
		char[] stringLetters;
		int offset; //array index
		
		/* prompt user for a word */
		System.out.print("Enter a word: ");
		word = input.nextLine();
		
		/* convert word to char array and count letter occurrences */
		word = word.toUpperCase();
		stringLetters = word.toCharArray();
		for (int letter = 0; letter < stringLetters.length; letter++) 
		{
			//If statement will run nothing if the character is non alphabetic
			if (stringLetters[letter] < 65 || stringLetters[letter] > 90)
			{
				
			}
			
			else
			{
				offset = stringLetters[letter] - LOW; //offset is the position of the letter in the array; EX: stringletters[0] is B (if word is BABY) and B in unicode is 66. LOW is = A, which in unicode = 65. Offset calculates the difference of 1, meaning index 1
				letterCounts[offset] += 1; //This uses the index of the letter and adds 1 to the value at that index
			}
		}
		
		/* show letter occurrences */
		for (int i = LOW; i <= HIGH; i++) 
		{
			System.out.println((char)i + ": " + letterCounts[i - LOW]);
		}
	}
}