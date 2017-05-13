import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UselessButton implements ActionListener {
	static JButton britain = new JButton();

	public static void main(String[] args) {
		JFrame france = new JFrame();
		JPanel japan = new JPanel();

		france.setVisible(true);
		france.add(japan);
		japan.add(britain);
		france.setTitle("WWIII");
		britain.setText("Start WWIII");
		france.pack();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed= (JButton) event.getSource();
		if (buttonPressed== britain) {
			System.out.println("No");  
		}

	}

}
