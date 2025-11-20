package skillBuilders;

public class Rectangle 
{
	private double width;
	private double length;
	
	public Rectangle()
	{
		width = 1;
		length = 1;
	}
	
	public Rectangle(double w, double l)
	{
		width = w;
		length = l;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public double area()
	{
		double rectArea = width * length;
		return rectArea;
	}
	
	public double perimeter()
	{
		double rectPer = (width * 2) + (length * 2);
		return rectPer;
	}
	
	public static void displayAreaFormula() 
	{
		System.out.println("The formula for the area of a rectangle is a=w*l");
	}
	
	public boolean equals()
	{
		
	}
	
	public String toString() 
	{
		 String rectangleString;
		 rectangleString = "Rectangle has width " + width + " and length " + length;
		 return(rectangleString);
	}
	
	
	
}
