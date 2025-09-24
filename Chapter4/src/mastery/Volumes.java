package mastery;
import java.util.Scanner;
import java.lang.Math;

public class Volumes {

	public static void main(String[] args) 
	{
		//Disclaimer
		System.out.println("ALL VOLUMES ARE ROUNDED TO THREE DECIMAL PLACES! ");
		System.out.println("");
		
		//Get user input for rectangular prism
		System.out.println("Rectangular Prism");
		Scanner input = new Scanner(System.in);
		System.out.print("Length: ");
		double prismLength = input.nextDouble();
		System.out.print("Width: ");
		double prismWidth = input.nextDouble();
		System.out.print("Height: ");
		double prismHeight = input.nextDouble();

		
		//Calculate and display prism volume
		double prismVolume = prismLength * prismWidth * prismHeight;
        double pVRounded = (int)(prismVolume * 1000 + 0.5) / 1000.0;
		System.out.println("The volume is: " + pVRounded);
		System.out.println("");
		
		//Get user input for sphere
		System.out.println("Sphere");
		System.out.print("Radius: ");
		double radius = input.nextDouble();
		
		//Calculate and display sphere volume
		double sphereDiameter = 2 * radius;
		sphereDiameter = Math.pow(sphereDiameter, 3.0);
		double sphereVolume = Math.PI * sphereDiameter;
		sphereVolume /= 6;
		double sVRounded = (int)(sphereVolume * 1000 + 0.5) / 1000.0;
		System.out.println("The volume is: " + sVRounded);
		System.out.println("");
		
		//Get user input for cube
		System.out.println("Cube");
		System.out.print("Enter the side length: ");
		double sideLength = input.nextDouble();
		
		//Calculate and display cube volume
		double cubeVolume = Math.pow(sideLength, 3.0);
		double cVRounded = (int)(cubeVolume * 1000 + 0.5) / 1000.0;
		System.out.println("The volume is: " + cVRounded);
	}

}
