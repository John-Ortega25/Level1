import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JButton buttonConvert= new JButton();
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextField text= new JTextField(5);
	JLabel label= new JLabel();
	
	public void CreatUI(){
		frame.setSize(500, 500);
		frame.add(panel);
		frame.setVisible(true);
		label.setText("Enter a number from 1-15");
		panel.add(label);
		panel.add(text);
		panel.add(buttonConvert);
		buttonConvert.setText("Convert");
		panel.setVisible(true);
		buttonConvert.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed= (JButton) e.getSource();
		if (buttonPressed== buttonConvert) {
			String input= text.getText();
			System.out.println(input);
			int numInput= Integer.parseInt(input);
			
			int eightDigit= numInput/8;
			numInput= numInput -8* eightDigit;
			
			int fourDigit= numInput/4;
			numInput= numInput -4* fourDigit;
			
			int twoDigit= numInput/2;
			numInput= numInput -2* twoDigit;
			
			int oneDigit= numInput/1;
			numInput= numInput -2* oneDigit;
		}
		
		
	}
	public static void main(String[] args) {
		BinaryConverter convert= new BinaryConverter();
		convert.CreatUI();
	}

}
