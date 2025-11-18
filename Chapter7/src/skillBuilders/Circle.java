package skillBuilders;

public class Circle {

	private int radius;
	private double PI = 3.14159265358
	
	public Circle()
	{
		radius = 1
		
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public void setRadius(int newRadius)
	{
		radius = newRadius;
	}
	
	public void setCircumfrence(int newCircumfrence)
	{
		circumfrence = 2*PI*getRadius(); 
	}
	
	public int circumference()
	{
		return circumference;
	}



}
