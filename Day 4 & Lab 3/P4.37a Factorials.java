package 437a
{
import java.util.Scanner;

public class Factorials
{
public static void main{String args[]}
{
Scanner input = new Scanner(System.in);

int factorial = 1;

System.out.printf("Enter a number to find its factorial: ");
int number = input.nextInt();

for (int n = 1; n <= number; n++){
factorial = factorial*n;
}

System.out.println("The factorial of " + number + " is: " + factorial);
}
}


/*EX. number inputted as 5... so 
/1st  factorial= factorial * n so factorial = 1*1
2nd factorial = factorial * n so factorial = (1*1) * 2
3rd factorial = factorial * n so factorial = (1*1*2) * 3
4th factorial = factorial * n so factorial = (1*1*2*3) * 4
5th factorial = factorial * n so factorial = (1*1*2*3*4) * 5

Then System.out.println prints "The factorial of 5 is: 120"
*/
