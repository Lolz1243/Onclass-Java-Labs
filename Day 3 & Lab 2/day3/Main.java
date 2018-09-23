package day3;

public class Main {

	public static void main(String[] args){
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setTank(0);
		car1.setSpeed(60);
		
		car2.setTank(3);
		car2.setSpeed(10);
		
		car1.goFast();//adds 5 speed to initial speed of car1
		car1.goFast();//adds another 5
		car1.setTank(15);//variable tank becomes 15 b/c setTank makes int t = 15 and tank is defined as t so tank value is 15
		
		car2.goFast();//adds 5 speed to initial speed of car2
		car2.setTank(10);//resets variable tank value to 10 b/c setTank function makes int t = 1- and tank is defined as t so tank value is 10
		car2.goFast();//adds another 5
		
		int sp;
		sp = car1.getSpeed();
		if (sp > 10)
			System.out.println("Your car is going too fast");
		
		System.out.println("Displaying car1 information:");
		car1.display();
		
		System.out.println("Displaying car2 information:");
		car2.display();
	}
}
