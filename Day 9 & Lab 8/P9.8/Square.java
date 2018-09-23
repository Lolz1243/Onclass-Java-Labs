package P98;

public class Square extends Rectangle{

	public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	public double getArea()
	{
		top_length = topright.getX() - topleft.getX();
		bottom_length = bottomright.getX() - bottomleft.getX();
		
		System.out.printf("%nParallelogram Square1's dimensions: %nBase: %d %nHeight: %d", top_length, bottom_length);

		double area = (top_length * bottom_length);
		return area;
	}
}
