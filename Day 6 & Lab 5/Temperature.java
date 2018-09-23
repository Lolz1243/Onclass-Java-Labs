package P622;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Type 1 to convert from Fahrenheit to Celsius %n");
		System.out.printf("Type 2 to convert from Celsius to Fahrenheit %n");
		int in = input.nextInt();
		
		switch(in){
		
		case 1: 
			System.out.print("Enter a temperature in Fahrenheit: ");
			double f = input.nextDouble();
			double tempc = celsius(f);
			System.out.printf("The temperature in degrees Celsius is: %.2f", tempc);
			break;
		case 2:
			System.out.print("Enter a temperature in Celsius: ");
			double c = input.nextDouble();
			double tempf = fahrenheit(c);
			System.out.printf("The temperature in degrees Fahrenheit is: %.2f", tempf);
			break;
		}
		
	}
	
	public static double celsius(double f){
		double c = 5.0 / 9.0 * (f - 32);
		return c;
	}
	
	public static double fahrenheit(double c){
		double f = 9.0 / 5.0 * c + 32;
		return f;
	}
	
}
