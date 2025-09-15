package mastery;
import java.text.NumberFormat;
import java.util.Scanner;

public class Election {

	public static void main(String[] args) 
	{
		//Prompt for election results
		//BC
		Scanner input = new Scanner(System.in);
		System.out.println("Elction Results for BC: ");
		System.out.println("John: ");
		int johnVotesBC = input.nextInt();
		System.out.println("Carrie: ");
		int carrieVotesBC = input.nextInt();
		System.out.println("");
		
		//Alberta
		System.out.println("Elction Results for Alberta: ");
		System.out.println("John: ");
		int johnVotesAB = input.nextInt();
		System.out.println("Carrie: ");
		int carrieVotesAB = input.nextInt();
		System.out.println("");
		
		//Saskatchewan
		System.out.println("Elction Results for Saskatchewan: ");
		System.out.println("John: ");
		int johnVotesSK = input.nextInt();
		System.out.println("Carrie: ");
		int carrieVotesSK = input.nextInt();
		System.out.println("");
				
		//Calculations
		int johnTotal = johnVotesBC + johnVotesAB + johnVotesSK;
		int carrrieTotal= carrieVotesBC + carrieVotesAB + carrieVotesSK;
		NumberFormat percent = NumberFormat.getPercentInstance();
		int johnPercent = percent.format(johnTotal);
	}

}
