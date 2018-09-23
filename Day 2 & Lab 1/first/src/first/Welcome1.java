/*
 * This is the program
 * that tests how print and println work.
*/
package first;

public class Welcome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("This is my first program");
        System.out.println("I enjoy Java");
        System.out.print("abc");
        System.out.println("DEF");
        System.out.println("He said, \"this is excellent\" ");
        
        int x;
        x = 22345;
        x = x%10000;
        System.out.println("The result is " + x);
        
        System.out.printf("The value %d is shown", x);
	}

}
