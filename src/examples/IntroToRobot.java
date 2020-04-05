package examples;

import org.jointheleague.graphical.robot.Robot;

public class IntroToRobot {
	public static void main(String[] args) {

		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setPenWidth(20);
		r2d2.setSpeed(4);
		for (int countSquares = 1; countSquares <= 4; countSquares++) {
			r2d2.setRandomPenColor();
			for (int countSides = 1; countSides <= 4; countSides++) {
				r2d2.move(100);
				if (countSides < 4)
					r2d2.turn(90);
			}
		}
	}
}
