package skillBuilders;
import java.text.NumberFormat;
import java.util.Scanner;

public class GradeAvgPt2 {

	public static void main(String[] args) {
		
		//Introduce user
		System.out.println("GRADE AVERAGE CALCULATOR");
		System.out.println("This calculator will display the average of 5 grades");
		System.out.println("");
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first grade: ");
		double totalAvg = input.nextDouble();
		
		System.out.print("Enter the second grade: ");
		totalAvg += input.nextDouble();
		
		System.out.print("Enter the third grade: ");
		totalAvg += input.nextDouble();
		
		System.out.print("Enter the fourth grade: ");
		totalAvg += input.nextDouble();
		
		System.out.print("Enter the fifth grade: ");
		totalAvg += input.nextDouble();
		
		//Calculate average
		totalAvg /= 5; 
		totalAvg = 1 * (int)totalAvg;
		totalAvg /= 100;
		
		//Display average with percent format
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.print("The grade average is " + percent.format(totalAvg));

	}

}
