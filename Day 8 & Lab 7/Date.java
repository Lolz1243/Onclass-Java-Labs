package P814;
/*
8.14 (Date Class) Create class Date with the following capabilities:
a) Output the date in multiple formats, such as

MM/DD/YYYY
June 14, 1992
DDD YYYY

b) Use overloaded constructors to create Date objects initialized with dates
of the formats in part (a). In the first case the constructor should receive
three integer values. In the second case it should receive a String and two
integer values. In the third case it should receive two integer values, the
first of which represents the day number in the year. [Hint: To convert the
String representation of the month to a numeric value, compare Strings using
the equals method. For example, if s1 and s2 are Strings, the method call
s1.equals(s2) returns true if the Strings are identical and otherwise returns
false.]
 */
public class Date {

	private int month;
	private int day;
	private int year;
	private int days; 
	private static final int[] daysPerMonth = 
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	
	private static final String[] monthsPerYear =
		{ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
	
	public Date(int month, int day, int year)
	{
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException(
					"month (" + month + ") must be 1-12");
		if (day <= 0 ||
		   (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		
		if (month == 2 && day == 29 && !(year % 400 == 0 ||
				(year % 4 == 0 && year % 100 != 0)))
				throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
				
		this.month = month;
		this.day = day;
		this.year = year;
		
	}
	
	public Date(String month_of_year, int day, int year)
	{
		this.month = 0;
		for (int i = 0; i < 12; i++)
		{
			if (monthsPerYear[i].equals(month_of_year))
			{
				this.month = i + 1;
				break;
			}
		}
		
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException(
					"month (" + month_of_year + ") must be " + monthsPerYear[0] + " to " + monthsPerYear[11]);
		
		if (day <= 0 ||
			(day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
				
		if (month == 2 && day == 29 && !(year % 400 == 0 ||
				(year % 4 == 0 && year % 100 != 0)))
				throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		
		this.day = day;
		this.year = year;
	}
	
	public Date(int days, int year)
	{
		if (days <= 0 || days > 365)
			throw new IllegalArgumentException(
					"days (" + days + ") must be 1-365");
		
		this.days = days;
		this.year = year;
	}
	
	
	public String toString()
	{
		return String.format("%02d/%02d/%04d", month, day, year);
	}

	public String toLongDate()
	{
		return String.format("%9s %02d, %04d", monthsPerYear[month - 1], day, year);
	}
	
	public String daysOfYear()
	{
		return String.format("%03d %04d", days, year);
	}
	

}
