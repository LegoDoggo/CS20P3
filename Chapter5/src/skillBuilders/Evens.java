package skillBuilders;

public class Evens {

	public static void main(String[] args) 
	{
		//Initialize Variables
		int number = 1;
		
		//Count to 20 using evens
		while (number <= 20)
		{
			int checkEven = number % 2;
			
			if (checkEven == 0)
			{
				System.out.println(number);
			}
			
			number++;
		}

	}

}
