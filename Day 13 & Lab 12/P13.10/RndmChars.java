package P1310;
/*
Write an application that randomly draws characters in different fonts,
sizes, and colors.
*/

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.GraphicsEnvironment;
import java.security.SecureRandom;
public class RndmChars extends JPanel{
	
	SecureRandom randomNumbers = new SecureRandom();
	int red = randomNumbers.nextInt(266);
	int green = randomNumbers.nextInt(266);  
	int blue = randomNumbers.nextInt(266);
	int red2 = randomNumbers.nextInt(266);
	int green2 = randomNumbers.nextInt(266);  
	int blue2 = randomNumbers.nextInt(266);
	int randFontSize = randomNumbers.nextInt(72) + 1;
	int randFontSize2 = randomNumbers.nextInt(72) + 1;
	Color randColor = new Color(red, green, blue);
	Color randColor2 = new Color(red2, green2, blue2);
	char randChar = (char)(randomNumbers.nextInt(94) + 33);//ASCII characters
	char randChar2 = (char)(randomNumbers.nextInt(94) + 33);
	String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	int index = (int)(Math.random() * (fontNames.length - 1));
	String randFontName = fontNames[index];
	String randFontName2 = fontNames[index + 1];
	
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	
		
		g.setColor(randColor);
		g.setFont(new Font(randFontName, Font.PLAIN, randFontSize));
		g.drawString(Character.toString(randChar), 20, 50);
		
		g.setColor(randColor2);
		g.setFont(new Font(randFontName2, Font.PLAIN, randFontSize2));
		g.drawString(Character.toString(randChar2), 20, 100);
		

	}

}
