package P84;
/*
8.4 (Rectangle Class) Create a class Rectangle with attributes length and 
width, each of which defaults to 1. Provide methods that calculate the 
rectangle’s perimeter and area. It has set and get methods for both length and
width. The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0. Write a program to
test class Rectangle.
 */
public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle()
	{
		this.length = 1;
		this.width = 1;
	}
	
	public double perimeter(double length, double width)
	{
		double perimeter = 2 * (this.getLength() + this.getWidth());
		
		return perimeter;
	}
	
	public double area(double length, double width)
	{
		double area = this.getLength() * this.getWidth();
		
		return area;
	}
	
	
	public void setLength(double length)
	{
		if(length < 0.0 || length > 20.0)
			throw new IllegalArgumentException("length must be > 0.0 & < 20.0");
		
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		if(width < 0.0 || width > 20.0)
			throw new IllegalArgumentException("width must be > 0.0 & < 20.0");
		
		this.width = width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
}
