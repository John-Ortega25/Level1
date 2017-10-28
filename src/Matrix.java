import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Matrix implements ActionListener {

	JButton redButton = new JButton();
	JButton blueButton = new JButton();

	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		blueButton.setText("blue");
		panel.add(blueButton);
		redButton.setText("red");
		panel.add(redButton);
		redButton.addActionListener(this);
		blueButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) (e.getSource());
		if (redButton == buttonPressed) {
			System.out.println("red is better than blue");
		} else if (blueButton == buttonPressed) {
			System.out.println("blue is better");
		}
	}

	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.createUI();
	}
}