package mastery;

public class Food 
{
	//Order price variable
	private double orderPrice;
	
	//Food info variables
	private double price;
	private double fat;
	private double carbs;
	private double fiber;
	private String name;
	
	//Constructor method (for order price)
	public Food()
	{
		orderPrice = 0;
	}
	
	//Overloaded constructor (for food info)
	public Food(double pr, double fa, double ca, double fi, String na)
	{
		price = pr;
		fat = fa;
		carbs = ca;
		fiber = fi; 
		name = na;
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
	
	//Name
	public String getName()
	{
		return name;
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
	
	//Name
	public void setName(String na)
	{
		name = na;
	}
	
	
	//toString to print each object
	public String toString()
	{
		//French fries are printed differently so if statement is needed
		
		//Print for fries
		if (name.equals("french fries"))
		{
			return "French fries have " + fat + "g fat, " + carbs + "g carbs, and " + fiber + "g fiber.";
		}
		
		//Print for other food objects
		else
		{
			return "Each " + name + " has " + fat + "g fat, " + carbs + "g carbs, and " + fiber + "g fiber.";
		}
	}
	
	
	//Method to calculate order total
	public void calculatePrice(int numBurg, int numSal, int numFry, int numSoda, Food burger, Food salad, Food fries, Food soda)
	{
		double burgPrice = numBurg * burger.getFPrice();
		double salPrice = numSal * salad.getFPrice();
		double fryPrice = numFry * fries.getFPrice();
		double sodaPrice = numSoda * soda.getFPrice();
		
		orderPrice = burgPrice + salPrice + fryPrice + sodaPrice;
	}

}

