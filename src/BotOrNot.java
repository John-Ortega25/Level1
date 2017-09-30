import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotOrNot implements ActionListener {
	JTextField text = new JTextField(10);
	String captcha2 = "captcha2";
	Random generator = new Random();
	int num = generator.nextInt(10);

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		System.out.println("Button clicked");
		// check what the user inputed
		if (num > 5) {
			if (text.getText().equals("qGphJD")) {
				JOptionPane.showMessageDialog(null, "You are a human!");
			} else {
				JOptionPane.showMessageDialog(null, "You are a bot!");
			}
		} else {
			if (text.getText().equals("smwm")) {
				JOptionPane.showMessageDialog(null, "You are a human!");
			} else {
				JOptionPane.showMessageDialog(null, "You are a bot!");
			}
		}
	}

	public void createUI() throws MalformedURLException {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.setText("ok");
		panel.add(text);
		if (num > 5) {
			String captcha = "Captcha.jpeg";
			displayCaptcha(panel, captcha);
		} else {
			String captcha2 = "captcha2.jpg";
			displayCaptcha(panel, captcha2);
		}

		button.addActionListener(this);
		frame.pack();

	}

	private void displayCaptcha(JPanel panel, String captcha) throws MalformedURLException {
		JLabel captchaLabelWithImage = createLabelImage(captcha);
		panel.add(captchaLabelWithImage);
	}

	public static void main(String[] args) throws MalformedURLException {
		BotOrNot bot = new BotOrNot();
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
