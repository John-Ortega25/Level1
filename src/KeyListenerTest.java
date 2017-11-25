import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyListenerTest implements KeyListener {
	JFrame frame= new JFrame();

	public void createUI(){
		frame.setVisible(true);
		
		
		frame.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("hello");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Greetings");
	}
	public static void main(String[] args) {
		KeyListenerTest test= new KeyListenerTest();
		test.createUI();
	}

}
