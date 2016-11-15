import lejos.nxt.Button;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class Ultraschall {

	public static void main(String[] args) {
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S2);
		
		while(Button.ESCAPE.isUp()){
			System.out.println(us.getDistance());
		}
		
	}

}
