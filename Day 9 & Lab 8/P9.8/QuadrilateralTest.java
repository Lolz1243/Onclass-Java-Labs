package P98;

public class QuadrilateralTest {

	public static void main(String[] args) {
		Trapezoid Trap1 = new Trapezoid(1,4,3,4,4,0,0,0);
		Parallelogram Par1 = new Parallelogram(1,2,6,2,5,0,0,0);
		Rectangle Rect1 = new Rectangle(0,2,6,2,6,0,0,0);
		Square Square1 = new Square(0,7,7,7,7,0,0,0);
		
		System.out.printf("%nTrap1's area: %.2f%n", Trap1.getArea());
		
		System.out.printf("%nPar1's area: %.2f%n", Par1.getArea());
		
		System.out.printf("%nRect1's area: %.2f%n", Rect1.getArea());
		
		System.out.printf("%nSquare1's area: %.2f", Square1.getArea());

	}

}
