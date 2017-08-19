import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SimonSaysRecipe extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable
	JFrame frame = new JFrame();

	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int randomNum;
	Date timeAtStart;

	private void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new
		// Integer(KeyEvent.VK_UP), "image.jpg");
		images.put(new Integer(KeyEvent.VK_UP), "Tiger.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "Lion.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "Panther.jpg");
		images.put(new Integer(KeyEvent.VK_LEFT), "Leopard.jpeg");
		// 3. Tell the user to "Press the matching key when 'Simon says'
		// otherwise press a different key"
		JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key");
		// 4. call the method to show an image
		showImage();

	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their
		// score at the end.
		int points = 0;
		// 17. if the keyCode matches the imageIndex and "Simon says..."
		// increase their score
		if (keyCode == imageIndex && simonSays()) {
			points = points + 1;
			speak("You are correct");
		}
		// 18. if the keyCode doesn't match the imageIndex and "Simon didn't
		// say..." increase their score
		else if (keyCode != imageIndex && this.randomNum < 4) {
			points = points + 1;
			speak("You are correct");
		}
		// 19. Use the speak method to tell the user if they were correct or not
		else {
			speak("You are incorrect");
		}
		// 13. increment tries by 1
		this.tries = tries + 1;
		// 14. if tries is greater than 9 (or however many you want)
		if (tries > 9) {
			System.exit(0);
		}
		// 15. exit the program

		// 11. dispose of the frame
		frame.dispose();
		// 12. call the method to show an image
		showImage();
	}

	private void showImage() {
		// 5. initialize your frame to a new JFrame()
		JFrame frame = new JFrame();
		// 6. set the frame to visible
		frame.setVisible(true);
		// 7. rename to the name of your frame
		frame.add(getNextRandomImage());
		// 8. set the size of the frame
		frame.setSize(500, 500);
		// 9. add a key listener to the frame
		frame.addKeyListener(this);
		// 10. Use the speak method to either say "Simon says press this key" or
		// "Press this key"

		// Hint: use the simonSays int and a random number
		Random generator = new Random();
		randomNum = generator.nextInt(11);
		if (simonSays()) {
			speak("Simon says press this key");
		} else {
			speak("Press this key");
		}

	}

	private boolean simonSays() {
		return randomNum > 4;
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSaysRecipe().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000); System.exit(0);
 */
