
//Add Phidgets Library
import com.phidget22.*;

public class Btn_LedEvents_TOW {
    //Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;

    //Handle Exceptions
    public static void main(String[] args) throws Exception {

    	//Variables
    	int timesBtnPressed = 0;
    	int player1Press = 0;
    	int player2Press = 0;
    	boolean currentGreenState = false;
    	boolean currentRedState = false;
    	boolean previousRedState = false;
    	boolean previousGreenState = false;
    	
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the red LED
            	turnRedLEDOn = e.getState();
            }
        });

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the green LED
                turnGreenLEDOn = e.getState();
            }
        });

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
        while(player1Press < 10 && player2Press < 10) {
            //Set current states
            currentGreenState = turnGreenLEDOn;
            currentRedState = turnRedLEDOn;
            
            //Count player presses
            if (currentGreenState && !previousGreenState)
            {
            	player2Press++;
            }
            
            if (currentRedState && !previousRedState)
            {
            	player1Press++;
            }
            
            previousGreenState = currentGreenState;
            previousRedState = currentRedState;
        
            //sleep for 150 milliseconds 
            Thread.sleep(50);
        }
        
        //Flash LEDs when game ends
        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(1500);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(500);
        
        //Print winner
        if (player1Press == 10)
        {
        	System.out.println("Player 1 wins!");
        }
        
        else if (player2Press == 10)
        {
        	System.out.println("Player 2 wins!");
        }
    }
}
  
