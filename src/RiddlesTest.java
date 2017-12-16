import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RiddlesTest implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	JTextField textField = new JTextField(5);
	
	public void GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(textField);
		panel.add(label);
		frame.setSize(500, 500);
		frame.setTitle("Riddles");
		label.setText("What has a head, a tail, is brown, and has no legs?");
		button.setText("submit");
		button2.setText("Help, I need a hint");
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String answer= textField.getText();
		if (buttonPressed == button) {

			if (answer.equalsIgnoreCase("Penny")) {
				JOptionPane.showMessageDialog(null, "You are correct!");
			} else {
				JOptionPane.showMessageDialog(null, "Sorry, try again next time");
			}
		}
		if (buttonPressed == button2) {
			JOptionPane.showMessageDialog(null, "I am carried in a pocket");
		}

	}

	public static void main(String[] args) {
		RiddlesTest test = new RiddlesTest();
		test.GUI();
	}
}
