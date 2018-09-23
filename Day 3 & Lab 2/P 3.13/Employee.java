package P313;

public class Employee {

	private String firstname;
	private String lastname;
	private double monthsalary;
	
	public Employee(String firstname, String lastname, double monthsalary){
		this.firstname = firstname;
		this.lastname = lastname;
		if (monthsalary > 0.00)
		this.monthsalary = monthsalary;

	}
	 public void setFirstName(String firstname)
	   {
	      this.firstname = firstname; 
	   } 

	   public String getFirstName()
	   {
	      return firstname; 
	   } 
	   
	 public void setLastName(String lastname)
	   {
		   this.lastname = lastname; 
	   } 

	   public String getLastName()
	   {
		  return lastname; 
	   } 
	   
		 public void setMonthSalary(double monthsalary)
		   {
			 if (monthsalary > 0.0)
		      this.monthsalary = monthsalary;
			 else if (monthsalary < 0.0)
				 System.out.println(" ");
			
	 
		   } 

		   public double getMonthSalary()
		   {
		      return monthsalary; 
		   } 
}
