import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyKnowledge implements KeyListener {
	JLabel label= new JLabel();
	public void CreateUI(){
		JFrame frame= new JFrame();
		JPanel panel= new JPanel();
		frame.add(panel);
		panel.add(label);
		label.setText("key: ");
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}
	private String keyDescription(KeyEvent event) {
		// TODO Auto-generated method stub
		return "key: " + event.getKeyChar();
	}

	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		label.setText(keyDescription(e)); 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		KeyKnowledge test= new KeyKnowledge();
		test.CreateUI();
	}

}
