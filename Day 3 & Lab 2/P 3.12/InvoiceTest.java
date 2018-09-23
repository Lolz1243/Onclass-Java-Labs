package P312;

import java.util.Scanner;


public class InvoiceTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Invoice invoice1 = new Invoice(" ", " ", 0, 0.00);
		System.out.println("Enter Item Number: ");
		String number = input.next();
		invoice1.setNumber(number);
		System.out.println("Enter Description: ");
		String description = input.next();
		invoice1.setDescription(description);
		System.out.println("Enter Quantity: ");
		int quantity = input.nextInt();
		invoice1.setQuantity(quantity);
		System.out.println("Enter Price Per Item: ");
		double price = input.nextDouble();
		invoice1.setPrice(price);

		
		System.out.println("Item Number: " + invoice1.getNumber());
		System.out.println("Item Description: " + invoice1.getDescription());
		if (quantity > 0)
		System.out.println("Quantity: " + invoice1.getQuantity());
		else
		System.out.println("Quantity: 0");
		if (price > 0.0)
		System.out.println("Price Per Item: $" + invoice1.getPrice());
		else 
		System.out.println("Price Per Item: $0.00");
		if (quantity > 0 && price > 0.0)
		System.out.println("Total Invoice Amount: $" + invoice1.getInvoiceAmount());
		else {
		System.out.println("Total Invoice Amount: $0.00");
		System.out.println("You have selected incorrect values for either the quantity or the price.");
		}
		
	}

}
