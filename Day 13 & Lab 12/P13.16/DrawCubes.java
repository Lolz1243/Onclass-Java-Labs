package P1316;
/*
Write an application that draws a cube. Use class GeneralPath and
method draw of class Graphics2D.
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.geom.GeneralPath;
import java.awt.Graphics2D;


public class DrawCubes extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);

		int[] xPoints = {50, 150, 150, 50, 50, 100, 200, 200, 100, 100};
		int[] yPoints = {50, 50, 150, 150, 50, 100, 100, 200, 200, 100};
		g.drawLine(50, 150, 100, 200);
		g.drawLine(150, 50, 200, 100);
		g.drawLine(150, 150, 200, 200);
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath cube = new GeneralPath();
		
		cube.moveTo(xPoints[0], yPoints[0]);
		
		for (int count = 1; count < xPoints.length; count++)
			cube.lineTo(xPoints[count], yPoints[count]);
		
		
		cube.closePath();

		g2d.draw(cube);
	}
}
