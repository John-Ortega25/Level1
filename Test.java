package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements ActionListener {
	JButton redButton = new JButton();
	JButton greenButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void CreateUI() {

		frame.setVisible(true);
		panel.setVisible(true);
		frame.add(panel);
		panel.add(greenButton);
		greenButton.setText("Green");
		panel.add(redButton);
		redButton.setText("Red");
		greenButton.addActionListener(this);
		redButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (redButton == buttonPressed) {
			panel.setBackground(Color.RED);
		} else {
			panel.setBackground(Color.GREEN);
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.CreateUI();
	}

}
