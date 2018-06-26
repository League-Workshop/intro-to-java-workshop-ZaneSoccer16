package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot e325 = new Robot();
		// 5. Set your robot's pen down
		e325.penDown();
		// 3. Set the robot to go at max speed (100)
		e325.setSpeed(500);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int k = 0; k < 75; k++) {e325.setRandomPenColor(); 
		e325.setPenWidth(k);
			// 7. Change the pen color to random

			// 6. Move the robot 5 times the loop counter (5*i)
e325.move(5*k);
			// 2. Turn the robot 360/7 degrees to the right
			e325.turn(360 / 7);
			// 8. Set the pen width to i
		}
	}
}
