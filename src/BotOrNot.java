import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotOrNot implements ActionListener {
	JTextField text= new JTextField(10);
	@Override
	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		//check what the user inputed
	}
	public void createUI() throws MalformedURLException{
		JFrame frame= new JFrame();
		JButton button= new JButton();
		JPanel panel= new JPanel();
		panel.setVisible(true);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.setText("ok");
		panel.add(text);
		String captcha= "Captcha.jpeg";
		JLabel captchaLabelWithImage= createLabelImage(captcha);
		panel.add(captchaLabelWithImage);
		frame.pack();
		
	}
	public static void main(String[] args) throws MalformedURLException {
		BotOrNot bot= new BotOrNot();
		bot.createUI();
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
