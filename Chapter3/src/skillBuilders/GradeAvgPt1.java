package skillBuilders;
import java.util.Scanner;

public class GradeAvgPt1 {

	public static void main(String[] args) {
		
		//Introduce user
		System.out.println("GRADE AVERAGE CALCULATOR");
		System.out.println("This calculator will display the average of 5 grades");
		System.out.println("");
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first grade: ");
		double grade1 = input.nextDouble();
		
		System.out.print("Enter the second grade: ");
		double grade2 = input.nextDouble();
		
		System.out.print("Enter the third grade: ");
		double grade3 = input.nextDouble();
		
		System.out.print("Enter the fourth grade: ");
		double grade4 = input.nextDouble();
		
		System.out.print("Enter the fifth grade: ");
		double grade5 = input.nextDouble();
		
		//Calculate average
		double totalAvg = grade1 + grade2 +grade3 + grade4 + grade5;
		totalAvg = totalAvg / 5; 
		totalAvg = 1 * (int)totalAvg;
		
		//Display average
		System.out.print("The grade average is " + totalAvg);

	}

}
