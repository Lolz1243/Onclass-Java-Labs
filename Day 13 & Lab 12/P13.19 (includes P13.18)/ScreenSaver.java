package P1319;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import java.security.SecureRandom;
/* P 13.18
 * Application should randomly draw lines using method drawLine of
 * class Graphics. After drawing 100 lines, the application should clear
 * itself and start drawing lines again. To allow the program to draw
 * continuously, place a call to repaint as the last line in method
 * paintComponent. Do you notice any problems with this on your system?
 */
public class ScreenSaverPLUSTimer extends JPanel
{
	
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			SecureRandom rand = new SecureRandom();
			int x1, y1, x2, y2;
			
			for (int i = 0; i < 100; i++)
			{
			x1 = rand.nextInt(300);
			y1 = rand.nextInt(300);
			x2 = rand.nextInt(300);
			y2 = rand.nextInt(300);
			
	        g.setColor(new Color (rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
			g.drawLine(x1, y1, x2, y2);
			}
			
			repaint();
		}

}
