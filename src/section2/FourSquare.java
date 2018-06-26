package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot r456 = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		r456.setSpeed(500);
		r456.penDown();
		// 5. Set the pen width to 5
		r456.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int l = 0; l < 4; l++) {
			// 7. Set the pen color to random
			r456.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();

			// 8. Turn the robot 90 degrees to the right
r456.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
			r456.move(200);
			r456.turn(90);

		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
