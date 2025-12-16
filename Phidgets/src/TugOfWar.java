import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar 
{

	public static void main(String[] args) throws Exception {
	{
		//Variables for each player's button presses
		int player1Press = 0;
		int player2Press = 0;
		
        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
		//Variables for current state of button
		boolean currentRed = false;
		boolean currentGreen = false;
		
		//Variables for previous state of button
		boolean prevStateRed = false;
		boolean prevStateGreen = false;
        
        //Count player presses
        while (player1Press < 10 && player2Press < 10)
        {
            currentRed = redButton.getState();
            currentGreen = greenButton.getState();

            if (currentRed && !prevStateRed)
            {
                player1Press++;
            }

            if (currentGreen && !prevStateGreen)
            {
                player2Press++;
            }

            prevStateRed = currentRed;
            prevStateGreen = currentGreen;

            Thread.sleep(50);
        }
        
        //Flash LEDs when game ends
        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(1500);
        
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(500);
        
        if (player1Press > player2Press)
        {
        	for (int f = 0; f < 5; f++)
        	{
        		redLED.setState(true);
        		Thread.sleep(150);
        		redLED.setState(false);
        		Thread.sleep(150);
        	}
        }
        
        if (player1Press < player2Press)
        {
        	for (int f = 0; f < 5; f++)
        	{
        		greenLED.setState(true);
        		Thread.sleep(150);
        		greenLED.setState(false);
        		Thread.sleep(150);
        	}
        }
	}
	}
}
