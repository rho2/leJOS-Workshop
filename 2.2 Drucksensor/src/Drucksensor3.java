import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.util.Delay;

public class Drucksensor3 {

	public static void main(String[] args) {
		TouchSensor drucksensor = new TouchSensor(SensorPort.S1);
		
		while(drucksensor.isPressed() == false){
			Motor.A.forward();
			Motor.B.forward(); 
			Delay.msDelay(100);
		}

	}

}
