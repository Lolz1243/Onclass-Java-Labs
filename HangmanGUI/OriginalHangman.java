package HangmanGui;

/*
 * HangmanGui by Nikhil Vytla
 * Last edit 3:26 PM, Monday, July 18, 2016
 */


import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class OriginalHangman {
	static int wrongCount = 0;
	
	public static void main (String[] args)
	{
		
		HangMain myHangMan = new HangMain();
		Random rand = new Random();
		String[] wordbank = {"box", "drop", "eclipse", "solar", "lunar", "java", "mississippi", "sravya"};
		int randWordNum;
		int numOfLetters;
		int correctCount;
		
		Scanner input = new Scanner(System.in);
		String originalWord;
		char[] userWord;
		
		while(true)
		{
			randWordNum = rand.nextInt(wordbank.length);
			numOfLetters = wordbank[randWordNum].length();
			correctCount = 0;
			wrongCount = 0;
			originalWord = wordbank[randWordNum];
		
			userWord = new char[numOfLetters];
			Arrays.fill(userWord, '_');
		
			System.out.println("This word has " + numOfLetters + " letters.");
		
			while(wrongCount < 6)
			{	
				System.out.print("\nEnter the letter here: ");
				char match = input.next().trim().charAt(0);		
				int index = originalWord.indexOf(match);
			
				if (index == -1){
					System.out.printf( "\n%c is not in the word.", match);
					wrongCount++;
				}
			
				while (index >= 0) {  // indexOf returns -1 if no match found
					if (userWord[index] == '_'){
						userWord[index] = match;
						correctCount++;
						index = originalWord.indexOf(match, index + 1);
					}
					else{
						System.out.println("\nYou have already guessed this letter. Try again.");
						break;
					}
				}
				System.out.println();
				for (int letters = 0; letters < numOfLetters; letters++)
				{
					System.out.print(userWord[letters] + " ");
				}
			
				if (wrongCount == 6){
					break;
				}
				if (correctCount == numOfLetters){
					break;
				}
			}
			if (correctCount == numOfLetters){
				System.out.println("\nCongratulations. You guessed the word!");
				System.out.println("Enter 1 to play again.");
				int response = input.nextInt();	
				if (response != 1){
					break;
				}
			}	
			if (wrongCount == 6){
				System.out.printf("%n%nYou have made 6 incorrect guesses. Congratulations! You suck at this game!");
				System.out.printf("%nEnter 1 to play again: ");
				int ask = input.nextInt();	
				if (ask != 1){
					break;
				}
			}
		}
	}
	
	public int getWrongCount()
	{
		return wrongCount;
	}
}
