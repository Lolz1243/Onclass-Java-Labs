package Lab1Part1;

import java.util.Scanner;

public class Lab1Part1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	      int number1; // first number to add
	      int number2; // second number to add

	      System.out.print("Enter first integer: "); // prompt 
	      number1 = input.nextInt(); // read first number from user

	      System.out.print("Enter second integer: "); // prompt 
	      number2 = input.nextInt(); // read second number from user

	     if (number1 == number2)
	    	 System.out.printf("These numbers are equal");
	     
	     if (number1 > number2)
	         System.out.printf("%d is larger", number1, number2);
	     
	}

}
