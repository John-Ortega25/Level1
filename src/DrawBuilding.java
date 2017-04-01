import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class DrawBuilding {
	static Robot bot = new Robot();

	static void drawBuilding(int height,Color color) {

		bot.setSpeed(10);
		bot.penDown();
		bot.setPenColor(color);
		bot.move(height);
		bot.turn(90);
		bot.move(100);
		bot.turn(90);
		bot.move(height);
		bot.turn(-90);
		bot.setPenColor(Color.GREEN);
		bot.move(100);
		bot.turn(-90);
	}

	public static void main(String[] args) {
		drawBuilding(50, Color.RED);
		drawBuilding(200, Color.BLUE);
		drawBuilding(100, Color.GREEN);
		drawBuilding(300, Color.YELLOW);
	}

}
