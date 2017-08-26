import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton duckButton= new JButton();
	JButton fluffyUnicorn= new JButton();
	JButton frogButton= new JButton();
	
	public static void main(String[] args) {
		CutenessTV tv = new CutenessTV();
		
		tv.createUI();
	}

	private void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(500, 500);
		
		duckButton.addActionListener(this);
		duckButton.setText("Duck");
		panel.add(duckButton);
		
		fluffyUnicorn.addActionListener(this);
		fluffyUnicorn.setText("Fluffy Unicorn");
		panel.add(fluffyUnicorn);
		
		frogButton.addActionListener(this);
		frogButton.setText("Frog");
		panel.add(frogButton);
		
		
		frame.pack();
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed== duckButton) {
			showDucks();
		}
		else if (buttonPressed== frogButton) {
			showFrog();
		} else {
			showFluffyUnicorns();
		}
	}

}
