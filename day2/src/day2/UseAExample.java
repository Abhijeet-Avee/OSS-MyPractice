package day2;

import java.util.Scanner;

//A passenger is traveling from LN to Noida using metro

/*********************
 * 
 * @author VE00YM318
 *	using abstract class to implement abstraction and SOLID principle
 */
abstract class Vehicle{			//Abstract Class
	public abstract void move(String s, String d);
	
}

// SOLID: Applying O
class Bus extends Vehicle{
	@Override
	public void move(String s, String d) {
		System.out.println("Moving from "+s + " to "+ d +" using bus");
	}
}

class Metro extends Vehicle{
	@Override
	public void move(String s, String d) {
		System.out.println("Moving from "+s + " to "+ d +" using metro");
	}
}

class Passenger{
	private String name;
	public Passenger(String name) {
		this.name = name;
	}
	public void travel(String s, String d, Vehicle vehicle) {
		System.out.println("Name of passenger: "+ name);
		vehicle.move(s, d);
	}
}

public class UseAExample {
	public static void main(String[] args) {
		System.out.println("Choose the vehicle: ");
		System.out.println("1. For bus 2. For metro");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();
		Vehicle vehicle = null;
		// Introducing code flexibility using abstract class
		if(choice == 1)
			vehicle = new Bus();
		else if(choice == 2)
			vehicle = new Metro();
		Passenger passenger = new Passenger("yash");
		passenger.travel("laxmi nagar","noida", vehicle);
		scanner.close();
	}
}
