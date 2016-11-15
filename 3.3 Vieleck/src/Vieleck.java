import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class Vieleck {
	public static void main(String[] args) {
		DifferentialPilot pilot = new DifferentialPilot(56, 135, Motor.B, Motor.A);
		
		int anzahl = 4;
		
		for (int i = 0; i < anzahl; i++) {
			pilot.travel(100);
			pilot.rotate(360 / anzahl);
		}

	}

}
