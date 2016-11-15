import lejos.nxt.Button;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class Drucksensor {
	
	public static void main(String[] args) {
		
		TouchSensor drucksensor = new TouchSensor(SensorPort.S1);
		
		if(drucksensor.isPressed()){
			System.out.println("Gedrueckt");
		}
		else{
			System.out.println("Nicht gedrueckt");
		}

		Button.waitForAnyPress();
		
	}
	
}
