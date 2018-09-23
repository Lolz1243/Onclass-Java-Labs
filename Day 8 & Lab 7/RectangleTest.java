package P84;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		try
		{
		System.out.print("Enter a length: ");
		double l = input.nextDouble();
		rect.setLength(l);
		
		System.out.print("Enter a width: ");
		double w = input.nextDouble();
		rect.setWidth(w);
		
		System.out.printf("%nThe perimeter is: %n%.2f%n", rect.perimeter(rect.getLength(), rect.getWidth()));
		
		System.out.printf("%nThe area is: %n%.2f", rect.area(rect.getLength(), rect.getWidth()));
		}
		catch (IllegalArgumentException e)
		{
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
	}

}
