package Lab1Part3;

import java.util.Scanner;

public class Lab1Part3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Enter a five digit integer: "); // prompt 
	     n = input.nextInt(); // read integer from user
	     
		
		int n1 = n % 10000;
		int ONE = n/10000;
		int n2 = n1 % 1000;
		int TWO = n1/1000;
		int n3 = n2 % 100;
		int THREE = n2/100;
		int n4 = n3 % 10;
		int FOUR = n3/10;
		int n5 = n4 % 1;
		int FIVE = n4/1;
		
		System.out.printf("%d   %d   %d   %d   %d", 
						ONE, TWO, THREE, FOUR, FIVE);
		

	}

}
