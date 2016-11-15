import java.util.Iterator;

import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class PilotViereck {

	public static void main(String[] args) {
		DifferentialPilot pilot = new DifferentialPilot(56, 135, Motor.B, Motor.A);
		
		for (int i = 0; i < 4; i++) {
			pilot.travel(100);
			pilot.rotate(90);
		}
		
	}
}
