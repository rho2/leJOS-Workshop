import lejos.nxt.Button;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.util.Delay;

public class Drucksensor2 {

	public static void main(String[] args) {
		TouchSensor drucksensor = new TouchSensor(SensorPort.S1);
		
		System.out.println("Warte ...");
		
		while(drucksensor.isPressed() == false){
			Delay.msDelay(100);
		}
	
		System.out.println("Gedrueckt");
		
		Button.waitForAnyPress();
	}

}
