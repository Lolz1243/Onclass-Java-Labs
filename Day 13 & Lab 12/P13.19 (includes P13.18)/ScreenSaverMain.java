package P1319;

import java.awt.Color;
import javax.swing.JFrame;

public class ScreenSaverMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Insane ScreenSaver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenSaverFinal first = new ScreenSaverFinal();
		frame.add(first);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
