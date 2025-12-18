
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Thermostat
{
    public static void main(String[] args) throws Exception{

        //Create | This allows you to access data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Locate objects
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occurs.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        
        //Create set temperature variable
        double setTemp = 21;
        
        //Create timer variable
        int timer = 0;
        
 		//Variables for current state of button
        boolean currentRed = false;
        boolean currentGreen = false;

        //Variables for previous state of button
        boolean prevStateRed = false;
        boolean prevStateGreen = false;
        
        //Loop for thermostat function
        while (true)
        {
        	//Set current button state
            currentRed = redButton.getState();
            currentGreen = greenButton.getState();
            
        	//Determine what LED to light up depending on set temperature
        	if (temperatureSensor.getTemperature() < (setTemp - 2) || temperatureSensor.getTemperature() > (setTemp + 2))
        	{
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        	
        	else
        	{
        		redLED.setState(false);
        		greenLED.setState(true);
        	}
        	
        	//Increase and decrease set temperature
        	if (currentRed && !prevStateRed)
        	{
        		setTemp--;
        	}
        	
        	if (currentGreen && !prevStateGreen)
        	{
        		setTemp++;
        	}
        	
            prevStateRed = currentRed;
            prevStateGreen = currentGreen;
            
        	//Print current and set temperature every 10 seconds
        	if (timer == 100)
        	{
        		System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
        		System.out.println("Set Temperature: " + setTemp);
        		timer = 0;
        	}
        	
        	Thread.sleep(98);
        	timer++;
        }

    }
}