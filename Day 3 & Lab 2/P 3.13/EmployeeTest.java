package P313;
import java.util.Scanner;
public class EmployeeTest {


	public static void main(String[] args) {
		Employee employee1 = new Employee("Bob", "Elefante",  5000.00);
	    Employee employee2 = new Employee("Maria", "Farallon", -2456.53);
	    
	      System.out.printf("%s %s's yearly salary: $%.2f%n",
	    	         employee1.getFirstName(), employee1.getLastName(), employee1.getMonthSalary()*12); 
	      System.out.printf("%s %s's yearly salary: $%.2f%n%n",
	    	         employee2.getFirstName(), employee2.getLastName(), employee2.getMonthSalary()*12);
	      System.out.println("Here's a 10% raise!");
	      System.out.printf("%n%s %s's new yearly salary: $%.2f%n",
	    	         employee1.getFirstName(), employee1.getLastName(), employee1.getMonthSalary()*12*1.1); 
	      System.out.printf("%s %s's new yearly salary: $%.2f%n%n",
	    	         employee2.getFirstName(), employee2.getLastName(), employee2.getMonthSalary()*12*1.1);


	}

}
