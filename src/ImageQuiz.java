import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageQuiz {
	private static Component createImage(String urlString) throws MalformedURLException {
		URL link = new URL(urlString);
		ImageIcon picture = new ImageIcon(link);
		JLabel lab = new JLabel(picture);
		return lab;
	}

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		Component image = createImage(
				"https://images-na.ssl-images-amazon.com/images/G/01/img15/pet-products/small-tiles/23695_pets_vertical_store_dogs_small_tile_8._CB312176604_.jpg");
		quizWindow.add(image);
		quizWindow.pack();
		String Answer= JOptionPane.showInputDialog("Whats in the picture?");
		quizWindow.remove(image);
		Component image2= createImage(
				"https://s-media-cache-ak0.pinimg.com/736x/07/c3/45/07c345d0eca11d0bc97c894751ba1b46.jpg");
		quizWindow.add(image2);
		quizWindow.pack();
		String Answer2= JOptionPane.showInputDialog("What about this?");
		quizWindow.remove(image2);
		Component image3= createImage("http://weknowyourdreams.com/images/lizard/lizard-06.jpg");
		quizWindow.add(image3);
		quizWindow.pack();
		String Answer3= JOptionPane.showInputDialog("And this?");
		quizWindow.remove(image3);
		quizWindow.pack();
		
		
		int numCorrect= 0;
		if (Answer.equalsIgnoreCase("Dog")) {
			numCorrect= numCorrect+ 1;
		}
		if (Answer2.equalsIgnoreCase("Cat")) {
			numCorrect= numCorrect+1;
		}
		if (Answer3.equalsIgnoreCase("Lizard")) {
			numCorrect= numCorrect+1;
		}
		else {
			
		}
		
		quizWindow.remove(image3);
		if (numCorrect== 3) {
			JOptionPane.showMessageDialog(null, "You got 100% on the quiz!");
			}
		else if (numCorrect== 2) {
			JOptionPane.showMessageDialog(null, "You got 66% on the quiz!");
		}
		else if (numCorrect== 1) {
			JOptionPane.showMessageDialog(null, "You got 33% on the quiz!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You got 0% on the quiz!");
		}
	}
}
