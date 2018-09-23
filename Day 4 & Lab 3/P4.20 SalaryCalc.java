package P420;

import java.util.Scanner;

public class SalaryCalc {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name1, name2, name3;
		int hour1, hour2, hour3;
		double pay1, pay2, pay3, grossPay1, grossPay2, grossPay3;
		
		System.out.printf("Enter Employee 1 name: %n");
		name1 = input.next();
		
		System.out.println("Enter Employee 1 hours: ");
		hour1 = input.nextInt();
		
		System.out.println("Enter Employee 1 pay: ");
		pay1 = input.nextDouble();
		
		System.out.printf("Enter Employee 2 name: %n");
		name2 = input.next();
		
		System.out.println("Enter Employee 2 hours: ");
		hour2 = input.nextInt();
		
		System.out.println("Enter Employee 2 pay: ");
		pay2 = input.nextDouble();
		
		System.out.printf("Enter Employee 3 name: %n");
		name3 = input.next();
		
		System.out.println("Enter Employee 3 hours: ");
		hour3 = input.nextInt();
		
		System.out.println("Enter Employee 3 pay: ");
		pay3 = input.nextDouble();
		
		if (hour1 <= 40)
			grossPay1 = hour1 * pay1;
		else
			grossPay1 = (1.5 * (hour1-40) * pay1) + (40 * pay1);
		
		if (hour2 <= 40)
			grossPay2 = hour2 * pay2;
		else
			grossPay2 = (1.5 * (hour2-40) * pay2) + (40 * pay2);
		
		if (hour3 <= 40)
			grossPay3 = hour3 * pay3;
		else
			grossPay3 = (1.5 * (hour3-40) * pay3) + (40 * pay3);
		
		System.out.printf("%s's gross pay is: %.2f%n", name1, grossPay1);
		System.out.printf("%s's gross pay is: %.2f%n", name2, grossPay2);
		System.out.printf("%s's gross pay is: %.2f%n", name3, grossPay3);
		
}
}