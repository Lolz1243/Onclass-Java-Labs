package P729;
import java.util.Scanner;
public class Fibonacci2 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer n to find the nth fibonacci number: ");
		double n = input.nextDouble();
		
		double fn =  fibonacci(n);
		System.out.printf("The nth fibonacci number is: %.0f%n%n", fn);
		
		System.out.println("The largest, fully accurate number is the 79th Fibonacci number: 8944394323791464");
	}
	
	public static double fibonacci (double n) {
		if (n <= 0)
			System.out.println("You have entered a wrong number. Run the program again.");
		if (n == 1)
			return 0;
		
		if (n == 2 || n == 3)
			return 1;
		
		double fib2 = 1, fib1 = 1, fibnum = 1;
		for ( int i = 4; i <= n; i++){
			fibnum = fib2 + fib1;
			fib2 = fib1;
			fib1 = fibnum;
		}
		return fibnum;
	}

}