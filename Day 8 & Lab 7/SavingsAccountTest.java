package P86;

public class SavingsAccountTest {
	
	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		System.out.printf("Annual interest rate: 0.04%n");
		System.out.printf("%nsaver1%nOriginal Balance: $%6.2f%n", saver1.getSavingsBalance());
		System.out.printf("%5s%20s", "Month", "Savings Balance");
		for (int month = 1; month <= 12; month++)
		{
			System.out.printf("%n%5d%20.2f", month, saver1.calculateMonthlyInterest());
		}
		
		System.out.printf("%nsaver2%nOriginal Balance: $%6.2f%n", saver2.getSavingsBalance());
		System.out.printf("%5s%20s", "Month", "Savings Balance");

		for (int month = 1; month <= 12; month++)
		{
			System.out.printf("%n%5d%20.2f", month, saver2.calculateMonthlyInterest());
		}
		
		System.out.printf("%n%nNow, let's set the annual interest rate to 0.05%n%n");
		saver1.modifyInterestRate();
		
		System.out.printf("saver1 - NEW YEAR%n");
		System.out.printf("%5s%20s", "Month", "Savings Balance");
		System.out.printf("%n%5d%20.2f%n", 1, saver1.calculateMonthlyInterest());
		
		System.out.printf("%nsaver2 - NEW YEAR%n");
		System.out.printf("%5s%20s", "Month", "Savings Balance");
		System.out.printf("%n%5d%20.2f%n", 1, saver2.calculateMonthlyInterest());
	}
}
