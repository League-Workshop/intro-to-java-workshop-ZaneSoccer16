package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class Robot1 {

	public static <c390, speed> void main(String[] args) {

		// START HERE
		Robot c390 = new Robot();
		c390.penDown();
		c390.setRandomPenColor();
		c390.setSpeed(500);
		c390.sparkle();
		for (int z = 0; z < 4; z++) {
			c390.turn(90);
			c390.move(200);
		}
	}
}
