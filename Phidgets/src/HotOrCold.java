
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold 
{
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        
        //Create LED objects
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        //Locate LED objects
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        
        //Open LED connections
        redLED.open(1000);
        greenLED.open(1000);
        
        //Loop to turn on LEDs based on temperature
        while (true)
        {
	        if (temperatureSensor.getTemperature() >= 20 && temperatureSensor.getTemperature() <= 24)
	        {
	        	redLED.setState(false);
	        	greenLED.setState(true);
	        }
	        
	        else
	        {
	        	greenLED.setState(false);
	        	redLED.setState(true);
	        }
	        
	        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
        }
    }
}
