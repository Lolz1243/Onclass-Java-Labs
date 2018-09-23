package HangmanGui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class HangmanBody extends JPanel{

	OriginalHangman hangme = new OriginalHangman(); 
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		
		hangme.getWrongCount();
		
		
		g.drawLine(190, 50, 190, 30);//frame piece right on top of head
		g.drawLine(190, 30, 70, 30);//horizontal piece of frame
		g.drawLine(70, 30, 70, 333);//long vertical pole of frame
		g.drawLine(20, 333, 320, 333);//base of frame
		
		if (hangme.getWrongCount() >= 1)
			g.drawOval(150, 50, 80, 80);//head
		if (hangme.getWrongCount() >= 2)
			g.drawLine(190, 130, 190, 230);//body
		if (hangme.getWrongCount() >= 3)
			g.drawLine(190, 230, 250, 280);//right leg
		if (hangme.getWrongCount() >= 4)
			g.drawLine(190, 230, 130, 280);//left leg
		if (hangme.getWrongCount() >= 5)
			g.drawLine(190, 170, 250, 150);//right arm
		if (hangme.getWrongCount() == 6)
			g.drawLine(190, 170, 130, 150);//left arm
		
		repaint();
	}
}

