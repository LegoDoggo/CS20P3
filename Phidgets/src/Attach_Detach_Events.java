//Add Phidgets Library
import com.phidget22.*;

public class Attach_Detach_Events {

    public static void main(String[] args) throws Exception {
       
         //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open
        greenLED.open(1000);
        greenButton.open(1000);

        //Data Event | Event code runs when data from sensor changes. 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                //Print temperature
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Attach Event | Attach Events run when a Phidget is connected to the Object
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach!");
            }
        });

        //Detach Event | Detach Events run when a Phidget is disconnected from the Object
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach!");
            }
        });

        //Open
        temperatureSensor.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}
 
