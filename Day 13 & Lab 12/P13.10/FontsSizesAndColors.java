package P1310;

import javax.swing.JFrame;

public class FontsSizesAndColors
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Different fonts, sizes, and colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RndmChars rndm = new RndmChars();
		frame.add(rndm);
		frame.setSize(420, 150);
		frame.setVisible(true);
		

	}

}
