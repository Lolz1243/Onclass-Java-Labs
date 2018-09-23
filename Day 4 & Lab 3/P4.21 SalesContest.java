package P421;

import java.util.Scanner;

public class SalesContest {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int counter = 1, number, largest;
         System.out.println("Choose any ten numbers!");
         
         System.out.print("Enter number 1: ");
         largest = input.nextInt();
         
       while (counter < 10){
    	   System.out.printf("Enter number %d: ", counter + 1);
    	   number = input.nextInt();
    	   
    	   if (number > largest){
    		   largest = number;
    	   }
    	   ++counter;
       }
       System.out.printf("The largest number is: %d", largest);
    }
}
