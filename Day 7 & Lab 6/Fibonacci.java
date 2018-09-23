package P729;

import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer n to find the nth fibonacci number: ");
		int n = input.nextInt();
		
		int fn =  fibonacci(n);
		System.out.printf("The nth fibonacci number is: %d%n%n", fn);
		
		System.out.println("The largest, fully accurate number is the 47th Fibonacci number: 1836311903");
	}
	
	public static int fibonacci (int n) {
		if (n <= 0)
			System.out.println("You have entered a wrong number. Run the program again.");
		if (n == 1)
			return 0;
		
		if (n == 2 || n == 3)
			return 1;
		
		int fib2 = 1, fib1 = 1, fibnum = 1;
		for ( int i = 4; i <= n; i++){
			fibnum = fib2 + fib1; //fib2 + fib1 becomes value of fibnum
			fib2 = fib1; //fib1 value goes into fib2
			fib1 = fibnum; //fibnum value goes into fib1
		}
		return fibnum;
	}

}