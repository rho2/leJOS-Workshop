import lejos.nxt.Motor;
import lejos.util.Delay;

public class Motoren {

	public static void main(String[] args) {		
		
		Motor.A.rotate(360);
		
		Motor.A.forward();
		Motor.B.forward(); 
		
		
		Delay.msDelay(1000);
	}
	
}
