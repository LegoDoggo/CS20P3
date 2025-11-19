package skillBuilders;

public class Circle 
{
	private static final double PI = 3.14;
	private double radius;
	
	public Circle()
	{
		radius = 1;
	}
	
	public Circle (double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double Area()
	{
		double circleArea;
		
		circleArea = PI * radius * radius;
		
		return circleArea;
	}
	
	public double circumference()
	{
		double c;
		
		c = 2 * PI * radius;
		
		return c;
	}

}
