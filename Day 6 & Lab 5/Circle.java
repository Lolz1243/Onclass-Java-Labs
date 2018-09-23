package P620;

import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input radius of circle: ");
		double radius = input.nextInt();
		
		double area = circleArea(radius);
		
		System.out.println("Area of the circle is: " + area);
		
	}
	
	public static double circleArea(double radius){
			
		double c = Math.PI * Math.pow(radius, 2);
			
		return c;
	}
		
}
