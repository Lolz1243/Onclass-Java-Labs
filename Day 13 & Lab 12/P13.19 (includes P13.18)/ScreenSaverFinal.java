package P1319;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.Timer;
/* P 13.19
 * Package javax.swing contains a class called Timer that is capable of
 * calling method actionPerformed of interface ActionListener at a fixed
 * time interval (specified in milliseconds).
 * Modify solution from exercise 13.18 to remove the call to repaint from
 * method paintComponent. Declare your class to implement ActionListener.
 * (The actionPerformed method should simply call repaint.) Declare an
 * instance variable of type Timer called timer in your class. In the
 * constructor for you class, write the following statements:
 * 
 * 	timer = new Timer(1000, this);
 * timer.start();
 * 
 * ^ This creates an instance of class Timer that will call this object's
 * actionPerformed method every 1000 milliseconds (a.k.a. every second).
 */
public class ScreenSaverFinal extends JPanel implements ActionListener
{
	private Timer timer;
  
	public ScreenSaverFinal()
	{
		timer = new Timer(1000, this);
		timer.start();
	}
  
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Random rand = new Random();
		int x1, x2, y1, y2;
      
		for(int i=0; i < 100; i++)
		{
			x1 = rand.nextInt(300);
			y1 = rand.nextInt(300);
			x2 = rand.nextInt(300);
			y2 = rand.nextInt(300);
			g.setColor(new Color (rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
			g.drawLine(x1, y1, x2, y2);
		}
	}	
  
	public void actionPerformed(ActionEvent e)
	{	
		repaint();
	}

}