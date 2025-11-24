package mastery;

public class PiggyBank 
{
	//Money variables
	private double pennies;
	private double nickels;
	private double dimes;
	private double quarters;
	
	//Constructor method
	public PiggyBank()
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	public double getPennies()
	{
		return pennies;
	}
	
	public double getNickels()
	{
		return nickels;
	}
	
	public double getDimes()
	{
		return dimes;
	}
	public double getQuarters()
	{
		return quarters;
	}
}
