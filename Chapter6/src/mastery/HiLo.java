/*

Program: HiLo.java          Last Date of this Revision: November 3rd, 2025

Purpose: A program that allows the user to play a chance-based game called Hi-Lo.

Author: Easton Seeley
School: CHHS
Course: Computer Science 20
 
*/

package mastery;
import java.util.Scanner;

public class HiLo {
	
	//Method where player can risk points
	public static int riskPoints(int userPoints)
	{
		//Initialize variables
		boolean canUserContinue = false;
		int pointsToRisk = 0;
		
		//Loop to fix invalid point entries
		while (canUserContinue == false)
		{
			//Risk points
			Scanner input = new Scanner(System.in);
			System.out.println("");
			System.out.print("Enter points to risk: ");
			pointsToRisk = input.nextInt();
			System.out.println("");
			
			//If user enters an invalid amount of points, try again
			if (pointsToRisk > userPoints)
			{
				System.out.println("You do not have enough points to risk! Try again.");
			}
			
			else if (pointsToRisk <= 0)
			{
				System.out.println("That is not a valid number! Try again.");
			}
			
			else
			{
				canUserContinue = true;
			}
		}
		
		return pointsToRisk;
	}
	
	//Method where player can guess high/low
	public static int guess()
	{
		//Initialize variables
		int playerGuess = 0;
		boolean canUserContinue = false;
		
		//Loop to fix invalid point entries
		while (canUserContinue == false) 
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Predict 1=High 0=Low: ");
			playerGuess = input.nextInt();
			
			//If user enters an invalid guess, try again
			if (playerGuess > 1)
			{
				System.out.println("That is not a valid guess! Try again.");
			}
			
			else if (playerGuess < 0)
			{
				System.out.println("That is not a valid guess! Try again.");
			}
			
			else
			{
				canUserContinue = true;
			}
		}
		
		return playerGuess;
	}
	
	//Method runs when game ends
	public static void gameOver(int playerGuess)
	{
		//Game over message
		System.out.println("");
		System.out.println("GAME OVER");
		
		//Display number of guesses
		System.out.println("You took " + playerGuess + " guess(es) before the game ended.");
	}
	
	//Generate a random number between 1 and 13
	public static double generateRandNum()
	{
		double randomNum = (13 - 1 + 1) * Math.random() + 1; 
		return randomNum;
	}

	//Check if guess is correct
	public static boolean isGuessCorrect(int guessNum, int computerNumber)
	{
		//Initialize variables
		boolean didUserWin;
		int hiOrLo = 0;
		
		//Converted the generated number into something that can be compared to the guess (1 or 0)
		if (computerNumber < 7)
		{
			//Set number to low
			hiOrLo = 0;
		}
		
		else if (computerNumber > 7)
		{
			//Set number to high
			hiOrLo = 1;
		}
		
		
		//Check if guess is equal to generated number (win/lose)
		if (guessNum == hiOrLo)
		{
			didUserWin = true;
		}
		
		else if (computerNumber == 7)
		{
			didUserWin = false;
		}
		
		else
		{
			didUserWin = false;
		}
		
		return didUserWin;
	}
	
	//Determine how many points the user should have
	public static int pointsAmount(int userPoints, int pointsRisked, boolean hasUserWon)
	{
		userPoints -= pointsRisked;
		
		if (hasUserWon == true)
		{
			userPoints += (pointsRisked * 2);
		}
		
		return userPoints;
	}
	
	//Determine if user wants to play again
	public static boolean playAgain()
	{
		//Initialize variables
		boolean isInputValid = false;
		boolean restart = false;
		Scanner input = new Scanner(System.in);
		String playAgain;
		
		//While loop to make sure valid input is recorded
		while (isInputValid == false) 
		{
			//Ask user if they want to play again
			System.out.print("Play again? (y/n): ");
			playAgain = input.nextLine();
			playAgain = playAgain.toLowerCase();
			
			if (playAgain.equals("y"))
			{
				restart = true;
				isInputValid = true;
			}
			
			else if (playAgain.equals("n"))
			{
				restart = false;
				isInputValid = true;
			}
			
			else
			{
				System.out.println("That is not a valid input! Try again.");
			}
		}
		
		//This will return whether to continue the game or not
		return restart;
	
	}
	
	public static void main(String[] args) 
	{
		//Initialize variables
		int userPoints = 1000;
		int playerGuess = 0;
		
		//Loop until user runs out of points
		while (userPoints > 0)
		{
			//Introduce game
			System.out.println("High-Low Game");
			System.out.println("");
			System.out.println("Numbers 1 to 6 (inclusive) are low.");
			System.out.println("Numbers 8 to 13 (inclusive) are high.");
			System.out.println("The number 7 is an automatic loss.");
			System.out.println("You have " + userPoints + " points.");
			
			//Get values from methods that you can use to determine win/loss
			int pointsRisked = riskPoints(userPoints);
			int guessNum = guess();
			int computerNumber = (int) generateRandNum();
			
			//Display what the number is
			System.out.println("Number is " + computerNumber);
			
			//Display whether user has won or lost
			boolean hasUserWon = isGuessCorrect(guessNum, computerNumber);
			
			if (hasUserWon == true && userPoints > 0)
			{
				System.out.println("You win! :)");
			}
			
			else if (hasUserWon == false && userPoints > 0)
			{
				System.out.println("You lose. :(");
			}
			
			//Update number of guesses
			playerGuess++;
			
			//Update points
			userPoints = pointsAmount(userPoints, pointsRisked, hasUserWon);
			
			//Break if user is out of points
			if (userPoints <= 0)
			{
				break;
			}
			
			//Determine whether to keep going
			boolean keepGoing = playAgain();

			if (keepGoing == false) 
			{
			    break;
			}
		}
		
		//Points now have been depleted; end the game
		gameOver(playerGuess);
		
	}

}

/* Screen Dump

Paste the output of your code here
 
 */
