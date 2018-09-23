package P524;

public class DiamondPrint {

public static void main(String[] args) {
		for (int a = 1; a < 10; a+=2){ 
			for (int b = 0; b < 4 - a / 2; b++){ 
				System.out.print(" "); 
			}
			
			for (int b = 0; b < a; b++){
				System.out.print("*");
			}
			
			System.out.println();
			}
		for (int a = 7; a > 0; a -= 2) {
		      for (int b = 0; b < 4 - a / 2; b++){
		        System.out.print(" ");
		      }
		      for (int b = 0; b < a; b++){
		        System.out.print("*");
		      }
		      System.out.println();
		}
}
	}



/*
1st for: defines the limits of the variables inside
4 - a / 2 comes from a+=2 and 4 being the max spaces before and after an asterisk (at line one)
2nd for: defines number of spaces before asterisks
3rd for: defines number of asterisks (similar to BarChart)
System.out..... is for printing separate lines
4th for + final 2 nested fors: used for the final four lines, including 7, 5, 3, and 1 asterisks

***IMPORTANT LESSON: MUST CONSIDER LOGIC***

*/