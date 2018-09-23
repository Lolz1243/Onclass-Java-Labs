package Lab1Part2;

import java.util.Scanner;

public class Lab1Part2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x;//first number to read
	
	int y;//second number to read
	 System.out.print("Enter first integer: "); // prompt 
     x = input.nextInt(); // read first number from user

     System.out.print("Enter second integer: "); // prompt 
     y = input.nextInt(); // read second number from user
     
	if (x%y != 0)
		System.out.printf("%d is not a multiple of %d", x, y);
	
	if (x%y == 0)
		System.out.printf("%d is a multiple of %d", x, y);
	}

}
