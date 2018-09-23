package P1316;

import java.awt.Color;
import javax.swing.JFrame;

public class CubeMain {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Drawing a cube");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawCubes rect = new DrawCubes();
		frame.add(rect);
		frame.setSize(315, 330);
		frame.setVisible(true);
		
	}

}
