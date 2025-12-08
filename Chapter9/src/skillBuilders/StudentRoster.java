package skillBuilders;
import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) 
	{
		//Create variable and array
		int numStudents;
		String[] students;
		
		//Allocate space
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students in the class: ");
		numStudents = input.nextInt();
		students = new String[numStudents];
		
		//Loop for entering student names
		for(int i = 0; i < students.length; i++)
		{
			System.out.print("Enter the name of a student: ");
			students[i] = input.next();
		}
		
		//Display roster
		System.out.println("");
		System.out.println("Student Roster");
		System.out.println("");
		
		for(int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
	}

}
