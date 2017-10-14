import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	// Create UI
	JFrame frame;
	JPanel panel;
	Random generator = new Random();

	public void createUI() {
		frame= new JFrame();
		panel= new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(900, 900);
		int num = generator.nextInt(21);

		for (int i = 0; i <= 20; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if (i == num) {
				button.setText("mole");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String buttonValue = buttonPressed.getText();
		System.out.println("hello");
		if (buttonValue.equals("mole")) {
			frame.dispose();
			createUI();
		}
		
	}

	public static void main(String[] args) {
		WhackAMole mole = new WhackAMole();
		mole.createUI();
	}

	// Make the 0 button layout
	// frame
	// panel
	// generate random from 1 to 20
	// for loop
	// make button: instantiate, add listener, add to panel
	// if i equals random number
	// Make text equal mole

	// Action Performed

	// When a button is pressed,
	// check if it says "mole",
	// if yes, dispose the frame and start over again.
	// If no, play sound saying you lose

}
