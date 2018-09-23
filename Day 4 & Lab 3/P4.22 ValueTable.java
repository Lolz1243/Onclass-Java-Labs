package P422;

public class ValueTable {

	public static void main(String[] args) {
		
		
		String w = "N", x = "10*N", y = "100*N", z = "1000*N";
		System.out.printf("%s%10s%10s%10s",w,x,y,z);
		
		for (int n = 1; n < 6; ++n){
			System.out.printf("%n%s%8s%10s%10s", n,n*10,n*100,n*1000);
			
		}
	}
}
