package P78;
/* This program displays a variety of tasks using arrays. 
 * 
 * The output is as follows:
 * Part 
 * Code
 * Result
 * 
 * Each is separated by a blank line. 
 * The code is limited to the task. The result is outputted using print lines.
 */ 
public class ArrayTasks {

	public static void main(String[] args) {
		
		// part A
		System.out.printf("PART A%n");
		System.out.printf("Code: %nint[] f = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };%n");
		System.out.println("System.out.println('Element 6 of array f is: %d%n', f[5]);");
		int[] f = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.printf("%nElement 6 of array f is: %d%n", f[5]);
		
		// part B
		System.out.printf("%nPART B%n");
		System.out.printf("Code: %nint[] g = { 8, 8, 8, 8, 8 };%n");
		int[] g = { 8, 8, 8, 8, 8 };
		System.out.printf("%n%s%8s%n", "Index", "Value");
		for (int counter = 0; counter < g.length; counter++){
			System.out.printf("%5d%8d%n", counter, g[counter]);
		}
		
		// part C
		System.out.printf("%nPART C%n");
		String line = 
		"Code: \nfinal int ARRAY_LENGTH = 100;\n" + 
		"int[] c = new int[ARRAY_LENGTH];\n" + 
		"int total = 0;\n" + 
		"for (int counter = 0; counter < c.length; counter++){\n" + 
		"	c[counter] =  1 * counter;\n" + 
		"	total += c[counter];\n" + 
		"}\n";
		
		System.out.println(line);
		
		final int ARRAY_LENGTH = 100;
		int[] c = new int[ARRAY_LENGTH];
		int total = 0;
		for (int counter = 0; counter < c.length; counter++){
			c[counter] =  1 * counter;
			total += c[counter];
		}

		System.out.println("Total for array c: " + total);
		
		// part D
		System.out.printf("%nPART D%n");
		String line2 = 
		"Code: \nint [] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };\n" +
		"int [] b = new int[34];\n" +
		
		"System.arraycopy(a, 0, b, 0, a.length);\n";
		
		System.out.println(line2);
		
		int [] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int [] b = new int[34];
		
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int counter = 0; counter < b.length; counter++){
			System.out.printf("%5d%8d%n", counter, b[counter]);
		}
		
		// part E
		System.out.printf("%nPART E%n");
		String line3 =
		"Code: \nfinal int LENGTH = 99;\n" +
		"int [] w = new int[LENGTH];\n" +
		"int largest, smallest;\n" +
		"int counter = 0;\n" +
		"largest = w[1];\n" +
		"smallest = w[1];\n" +
		"for (counter = 0; counter < w.length; counter++){\n" +
		"	w[counter] =  1 * counter;\n" +
		"}" +
		"for (counter = 0; counter < w.length; counter++){\n" +
			
		"	if (w[counter] > largest){\n" +
		"		largest = w[counter];\n" +
		"	}\n" +
		"	if (w[counter] < smallest){\n" +
		"		smallest = w[counter];\n" +
		"	}\n" +
		"}\n" +
		"System.out.printf('The largest number is %d.%n', largest);\n" +
		"System.out.printf('The smallest number is %d.%n', smallest);\n";
		
		System.out.println(line3);
		
		final int LENGTH = 99;
		int [] w = new int[LENGTH];
		int largest, smallest;
		int counter = 0;
		largest = w[1];
		smallest = w[1];
		for (counter = 0; counter < w.length; counter++){
			w[counter] =  1 * counter;
		}
		for (counter = 0; counter < w.length; counter++){
			
			if (w[counter] > largest){
					largest = w[counter];
			}
			if (w[counter] < smallest){
					smallest = w[counter];
			}
		}
			System.out.printf("The largest number is %d.%n", largest);
			System.out.printf("The smallest number is %d.%n", smallest);
	
	}

}