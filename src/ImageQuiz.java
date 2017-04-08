import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
	}
}
