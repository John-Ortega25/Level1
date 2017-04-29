import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MultiRobot {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(Color.BLUE);
		for (int i = 0; i < 20; i++) {
			rob.turn(50);

			for (int j = 0; j < 20; j++) {
				rob.setRandomPenColor(); 
				rob.turn(30);
				rob.move(100);
			}
		}
	}
}
