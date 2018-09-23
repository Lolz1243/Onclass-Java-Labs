package P1212;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui2 extends JFrame{

	public Gui2()
	{
		doThings();
	}
	
	JButton b1;
	JButton b2;
	JButton b3;
	
	
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	
	JLabel lab1;
	JLabel lab2;
	
	private void doThings()
	{
		
		JPanel paper1;
		paper1 = new JPanel();
		
		JPanel paper2;
		paper2 = new JPanel();
		
		paper1.setLayout(new GridLayout(2,2));
		paper2.setLayout(new GridLayout(1,2));
		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);

		
		b1 = new JButton("CONVERT");
		b2 = new JButton("CLEAR");
		
		lab1 = new JLabel("Fahrenheit");
		lab2 = new JLabel("Celsius");
		
		
		paper2.add(b1);
		paper2.add(b2);
		
		paper1.add(lab1);
		paper1.add(tf1);
		
		paper1.add(lab2);
		paper1.add(tf2);
		
		
		add(paper1, BorderLayout.NORTH);
		add(paper2, BorderLayout.SOUTH);

		
		
		/*JButton bt1;
		bt1 = new JButton("Calculate");
		add(bt1,BorderLayout.NORTH);
		
		JButton bt2;
		bt2 = new JButton("Clear");
		add(bt2,BorderLayout.SOUTH);
		
		JTextField tf1;
		tf1 = new JTextField(10);
		add(tf1,BorderLayout.CENTER);
		*/
		Bh1 bh1 = new Bh1();
		
		b1.addActionListener(bh1);
		
		Bh2 bh2 = new Bh2();
		
		b2.addActionListener(bh2);
		
	}
	
	
	class Bh1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//tf2.setText("Button2 was clicked");
			String s1 = tf1.getText();
			double f = Double.parseDouble(s1);
			double c = 5.0 / 9.0 * (f - 32);

			
			tf2.setText(Double.toString(c));
		}
	}
	
	class Bh2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			tf1.setText("");
			tf2.setText("");
		}
	}
	
}


