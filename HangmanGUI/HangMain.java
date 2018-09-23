package HangmanGui;

import java.awt.Color;
import javax.swing.JFrame;

public class HangMain extends HangmanBody{

	public HangMain() {

		JFrame frame = new JFrame("Hangman");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HangmanBody rect = new HangmanBody();
		frame.add(rect);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}
// method with wrongCount as input
}
