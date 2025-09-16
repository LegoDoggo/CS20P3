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
		System.out.print("John: ");
		int johnVotesBC = input.nextInt();
		System.out.print("Carrie: ");
		int carrieVotesBC = input.nextInt();
		System.out.println("");
		
		//Alberta
		System.out.println("Elction Results for Alberta: ");
		System.out.print("John: ");
		int johnVotesAB = input.nextInt();
		System.out.print("Carrie: ");
		int carrieVotesAB = input.nextInt();
		System.out.println("");
		
		//Saskatchewan
		System.out.println("Elction Results for Saskatchewan: ");
		System.out.print("John: ");
		int johnVotesSK = input.nextInt();
		System.out.print("Carrie: ");
		int carrieVotesSK = input.nextInt();
		System.out.println("");
				
		//Calculations
		int johnTotal = johnVotesBC + johnVotesAB + johnVotesSK;
		int carrieTotal = carrieVotesBC + carrieVotesAB + carrieVotesSK;
		int totalVotes = johnTotal + carrieTotal;
		
		//Display final results and calculate percentages
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.format("%-15s %8s %10s %n", "Candidate", "Votes", "Percentage");
		System.out.format("%-15s %8s %10s %n", "John", johnTotal, percent.format((double)johnTotal / totalVotes));
		System.out.format("%-15s %8s %10s %n", "Carrie", carrieTotal, percent.format((double)carrieTotal / totalVotes));
		System.out.format("%-15s %8s %10s %n", "TOTAL VOTES: ", totalVotes, "");
	}

}