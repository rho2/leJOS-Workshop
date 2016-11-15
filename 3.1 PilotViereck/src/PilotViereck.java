import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class PilotViereck {

	public static void main(String[] args) {
		DifferentialPilot pilot = new DifferentialPilot(56, 135, Motor.B, Motor.A);
		
		pilot.travel(100);
		pilot.rotate(90);
		
		pilot.travel(100);
		pilot.rotate(90);
		
		pilot.travel(100);
		pilot.rotate(90);
		
		pilot.travel(100);
		pilot.rotate(90);
	}
}
