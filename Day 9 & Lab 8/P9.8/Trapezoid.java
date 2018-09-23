package P98;

public class Trapezoid extends Quadrilateral  {
	
	public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
	{
		topleft.setX(x1);
		topleft.setY(y1);
		
		topright.setX(x2);
		topright.setY(y2);
		
		bottomright.setX(x3);
		bottomright.setY(y3);
		
		bottomleft.setX(x4);
		bottomleft.setY(y4);

	}
	
	int top_length;
	int bottom_length;
	int right_height;
	int left_height;
	
	public double getArea()
	{
		top_length = topright.getX() - topleft.getX();
		bottom_length = bottomright.getX() - bottomleft.getX();
		right_height = topright.getY() - bottomright.getY();
		left_height = topleft.getY() - bottomleft.getY();
		
		System.out.printf("Trapezoid Trap1's dimensions: %nBase1: %d%nBase2: %d%nHeight: %d", top_length, bottom_length, right_height);
		
		double area = (0.5 * (top_length + bottom_length) * right_height);
		return area;
	}

}
