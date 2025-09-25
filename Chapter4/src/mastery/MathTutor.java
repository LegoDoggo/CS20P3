package mastery;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) 
	{
		//Introduce user
		System.out.println("Math Tutor");
		System.out.println("All answers in this program are rounded to the nearest integer.");
		System.out.println("");
		double answer = 0;
		String operatorDisplay = "";
		
		//Generate random numbers/operators
		int randomInteger1 = (int)(Math.random() * (10 - 1 + 1) + 1);
		int randomInteger2 = (int)(Math.random() * (10 - 1 + 1) + 1);
		int randomOperator = (int)(Math.random() * (4 - 1 + 1) + 1);
		
		
		//Determine answer and operator to display
		switch (randomOperator)
		{
		
		case 1:
			answer = randomInteger1 + randomInteger2;
			operatorDisplay = "+";
			break;
			
		case 2:
			answer = randomInteger1 - randomInteger2;
			operatorDisplay = "-";
			break;
			
		case 3:
			answer = randomInteger1 * randomInteger2;
			operatorDisplay = "*";
			break;
			
		case 4:
			answer = (double) randomInteger1 / randomInteger2;
			operatorDisplay = "/";
			break;
		
		}
		
		//Ask question to user and get input
		System.out.print("What is " + randomInteger1 + operatorDisplay + randomInteger2 + "?");
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.print("Answer: ");
		int userAns = input.nextInt();
		System.out.println("");
		
        //Round answer manually
        int roundedAnswer;
        if (answer >= 0)
            roundedAnswer = (int)(answer + 0.5);
        else
            roundedAnswer = (int)(answer - 0.5);
		
		//Determine whether answer is right or wrong
        if (userAns == roundedAnswer)
        {
            System.out.println("Correct!");
        } 
        else 
        {
            if (answer == (int)answer) // whole number
                System.out.println("Incorrect! The answer is " + (int)answer);
            else
                System.out.println("Incorrect! The answer is " + (int)answer);

        }

	}
	
}
