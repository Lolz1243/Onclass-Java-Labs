package P630;

import java.security.SecureRandom;
import java.util.Scanner;
public class GuessNumbers {

	private enum Status{ CONTINUE, WON };
	
	public static void main(String[] args) {
		Status gameStatus = null;
		SecureRandom rng = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
		int num;
		
		while (true){
		num = 1 + rng.nextInt(1000);
		
		System.out.print("Guess a number between 1 and 1000: ");
		int guess = input.nextInt();
		
		if (guess < num){
			System.out.println("Too low. Try again.");
			gameStatus = Status.CONTINUE;
		}
		else if (guess > num){
			System.out.println("Too high. Try again.");
			gameStatus = Status.CONTINUE;
		}
		else
			gameStatus = Status.WON;
		while (gameStatus == Status.CONTINUE)
		{
			System.out.print("Guess a number between 1 and 1000: ");
			guess = input.nextInt();
			if (guess < num){
				System.out.println("Too low. Try again.");
				gameStatus = Status.CONTINUE;
			}
			else if (guess > num){
				System.out.println("Too high. Try again.");
				gameStatus = Status.CONTINUE;
			}
			if (guess == num)
				gameStatus = Status.WON;
		}
		if (gameStatus == Status.WON){
			System.out.println("Congratulations. You guessed the number!");
			System.out.println("Press 1 to play again.");
			int response = input.nextInt();	
			if (response != 1){
				break;
			}
		}
		}
	}
}
