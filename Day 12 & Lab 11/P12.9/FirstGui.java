package P129;
//An intro to GUI and UI. This will help with the project
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstGui extends JFrame{

	public FirstGui()
	{
		doThings();
	}
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	
	JTextField tf1;
	
	private void doThings()
	{
		
		JPanel paper;
		paper = new JPanel();
		
		
		
		paper.setLayout(new GridLayout(4,4));
		
		tf1 = new JTextField(10);
		
		b1 = new JButton("7");
		b2 = new JButton("8");
		b3 = new JButton("9");
		b4 = new JButton("/");
		b5 = new JButton("4");
		b6 = new JButton("5");
		b7 = new JButton("6");
		b8 = new JButton("*");
		b9 = new JButton("1");
		b10 = new JButton("2");
		b11 = new JButton("3");
		b12 = new JButton("-");
		
		b13 = new JButton("0");
		b14 = new JButton(".");
		b15 = new JButton("=");
		b16 = new JButton("+");
		
		
		
		paper.add(b1);
		paper.add(b2);
		paper.add(b3);
		paper.add(b4);
		paper.add(b5);
		paper.add(b6);
		paper.add(b7);
		paper.add(b8);
		paper.add(b9);
		paper.add(b10);
		paper.add(b11);
		paper.add(b12);
		paper.add(b13);
		paper.add(b14);
		paper.add(b15);
		paper.add(b16);
		
		add(paper, BorderLayout.CENTER);
		add(tf1, BorderLayout.NORTH);

		
		
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
	}
}
