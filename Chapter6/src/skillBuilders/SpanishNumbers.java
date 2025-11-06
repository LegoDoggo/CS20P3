package skillBuilders;

public class SpanishNumbers {
	
	//Create method parameter so program knows what number to write
	public static void displayNum(int counter)
	{
		switch (counter)
		{
			//Display numbers based on parameter
			case 1:
				System.out.println("UNO");
				break;
				
			case 2:
				System.out.println("DOS");
				break;
				
			case 3:
				System.out.println("TRES");
				break;
				
			case 4:
				System.out.println("CUATRO");
				break;
				
			case 5:
				System.out.println("CINCO");
				break;
				
			case 6:
				System.out.println("SEIS");
				break;
				
			case 7:
				System.out.println("SIETE");
				break;
				
			case 8:
				System.out.println("OCHO");
				break;
				
			case 9:
				System.out.println("NUEVE");
				break;
				
			case 10:
				System.out.println("DIEZ");
				break;
		}
	}
	
	public static void main(String[] args) 
	{
		//Loop through the displayNum method 10 times
		for (int counter = 1; counter <= 10; counter++)
		{
			displayNum(counter);
		}
	}

}
