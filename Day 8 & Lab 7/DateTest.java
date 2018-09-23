package P814;

public class DateTest {

	public static void main(String[] args) {

		Date d1 = new Date(12, 28, 4534);
		Date d2 = new Date("November", 14, 2009);
		Date d3 = new Date(345, 1997);
		
		System.out.println(d1.toString());
		System.out.println(d2.toLongDate());
		System.out.println(d3.daysOfYear());
		
	}

}
