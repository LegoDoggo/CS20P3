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
	
	//Accessor methods
	
	//Order price
	public double getOPrice()
	{
		return Math.round(orderPrice * 100) / 100.0;
	}
	
	//Food price
	public double getFPrice()
	{
		return price;
	}
	
	//Fat
	public double getFat()
	{
		return fat;
	}
	
	//Carbs
	public double getCarbs()
	{
		return carbs;
	}
	
	//Fiber
	public double getFiber()
	{
		return fiber;
	}
	
	
	//Modifier methods
	
	//Order price
	public void setOPrice(double op)
	{
		orderPrice = op;
	}
	
	//Food price
	public void setFPrice(double pr)
	{
		price = pr;
	}
	
	//Fat
	public void setFat(double fa)
	{
		fat = fa;
	}
	
	//Carbs
	public void setCarbs(double ca)
	{
		carbs = ca;
	}
	
	//Fiber
	public void setFiber(double fi)
	{
		fiber = fi;
	}
	
	
}

