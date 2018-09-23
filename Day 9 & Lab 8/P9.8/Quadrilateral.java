package P98;

public abstract class Quadrilateral
{
	public Point topleft = new Point(0,0);
	public Point topright = new Point(0,0);
	public Point bottomright = new Point(0,0);
	public Point bottomleft = new Point(0,0);
	
	public abstract double getArea();
}
