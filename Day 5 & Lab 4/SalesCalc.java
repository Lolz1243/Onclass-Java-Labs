package P517;

import java.util.Scanner;

public class SalesCalc {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price;
		double total = 0;
		int num = 0,quantity = 0;
		System.out.print("You can stop this program at any time by inputting -1 for both the product number and the quantity.");
		while (num != -1 && quantity != -1){
		System.out.printf("%nPlease input your product number: ");
		num = input.nextInt();
			 
		System.out.print("Please input your quantity sold: ");
		quantity = input.nextInt();

		switch(num){
		case 1:
			price = 2.98;
			total += quantity * price;
		break;
		
		case 2:
			price = 4.50;
			total += quantity * price;
		break;
		
		case 3:
			price = 9.98;
			total += quantity * price;
		break;
		
		case 4:
			price = 4.49;
			total += quantity * price;
		break;
		
		case 5:
			price = 6.87;
			total += quantity * price;
		break;
	}
		}
		System.out.printf("%nThe total retail value of all products sold is: $%.2f!", total);

}
}
