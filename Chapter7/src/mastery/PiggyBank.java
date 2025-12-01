package mastery;

import java.util.Scanner;

public class PiggyBank 
{
	//Total money variable
	private double moneyTotal;
	
	//Money variables (value of each coin)
	private static final double penniesWorth = 0.01;
	private static final double nickelsWorth = 0.05;
	private static final double dimesWorth = 0.1;
	private static final double quartersWorth = 0.25;
	
	//Constructor method
	public PiggyBank()
	{
		moneyTotal = 0;
	}

	//Accessor method
	public double getMoney()
	{
		return Math.round(moneyTotal * 100) / 100.0;
	}
	
	//Modifier method
	public void setMoney(double m)
	{
		moneyTotal = m;
	}
	
	//Add money to bank
	public double addMoney(int choice)
	{
		switch (choice)
		{
			case 2:
				moneyTotal += penniesWorth;
				break;
				
			case 3:
				moneyTotal += nickelsWorth;
				break;
				
			case 4:
				moneyTotal += dimesWorth;
				break;
				
			case 5:
				moneyTotal += quartersWorth;
				break;
		}

		return moneyTotal;
	}
	
	//Remove money from bank
	public double takeMoney(int monTa)
	{
		switch (monTa)
		{
			case 1: 
				moneyTotal -= penniesWorth;
				break;
				
			case 2:
				moneyTotal -= nickelsWorth;
				break;
				
			case 3:
				moneyTotal -= dimesWorth;
				break;
				
			case 4:
				moneyTotal -= quartersWorth;
				break;
		}
			
		return moneyTotal;
	}
	
	//Return the total
	public double showTotal()
	{
		return moneyTotal;
	}
	
	//to string method to print total
	public String toString() 
	{
	    return "You have $" + getMoney();
	}

}
