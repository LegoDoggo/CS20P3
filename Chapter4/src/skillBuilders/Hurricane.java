package skillBuilders;
import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) 
	{
		//Introduce the user
		System.out.println("Hurricane Wind Speed");
		System.out.println("");
		
		//Get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1-5, depending on the intensity of your hurricane: ");
		int hurricaneIntensity = input.nextInt();
		System.out.println("");
		
		//Decide which wind speed to display
		switch(hurricaneIntensity)
		{
			case 1: System.out.print("Wind Speed: 74-95 mph or 64-82 kt or 119-153 km/hr"); break;
			
			case 2: System.out.print("Wind Speed: 96-110 mph or 83-95 kt or 154-177 km/hr"); break;
			
			case 3: System.out.print("Wind Speed: 111-130 mph or 96-113 kt or 179-209 km/hr"); break;
			
			case 4: System.out.print("Wind Speed: 131-155 mph or 114-135 kt or 210-249 km/hr"); break;
			
			case 5: System.out.print("Wind Speed: Greater than 155 mph or 135 kt or 249 km/hr"); break;
		}
		

	}

}
