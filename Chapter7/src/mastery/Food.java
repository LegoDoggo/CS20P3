package mastery;

public class Food 
{
	//Order price variable
	private double orderPrice;
	
	//Food info variables
	public double price;
	public double fat;
	public double carbs;
	public double fiber;
	
	//Constructor method (for order price)
	public Food()
	{
		orderPrice = 0;
	}
	
	//Overloaded constructor (for food info)
	public Food(double pr, double fa, double ca, double fi)
	{
		price = pr;
		fat = fa;
		carbs = ca;
		fiber = fi; 
	}
	
	//Accessor method
	public double getPrice()
	{
		return orderPrice;
	}
	
	//Modifier method
	public void setPrice(double op)
	{
		orderPrice = op;
	}
	
	
}

