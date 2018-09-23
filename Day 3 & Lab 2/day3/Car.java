package day3;

public class Car {
	private int tank;
	private int speed;
	
	public void goFast()
	{
		speed = speed + 5;
	}
	
	public void display()
	{
		System.out.println("This car is going " + speed + "MPH");
		System.out.println("This car has " + tank + "Gallons of gas");
	}
	
	public void setSpeed(int s)
	{
		speed = s;
	}
	
	public void setTank(int t)
	{
		tank = t;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	public int getTank()
	{
		return tank;
	}
}


