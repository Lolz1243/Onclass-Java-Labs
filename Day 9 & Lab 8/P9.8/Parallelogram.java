package P98;

public class Parallelogram extends Trapezoid{

	public Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3,int x4, int y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double getArea()
	{
		bottom_length = bottomright.getX() - bottomleft.getX();
		right_height = topright.getY() - bottomright.getY();
		
		System.out.printf("%nParallelogram Par1's dimensions: %nBase: %d %nHeight: %d", bottom_length, right_height);

		double area = (bottom_length * right_height);
		return area;
	}


}
