package P512;

public class OddProducts {


	public static void main(String[] args) {
		int m = 1;
		for (int n =1; n < 16; n += 2){
			m = m*n;
		}
		System.out.printf("The product of the odd integers from 1 to 15 is: %d", m);
	}

}
