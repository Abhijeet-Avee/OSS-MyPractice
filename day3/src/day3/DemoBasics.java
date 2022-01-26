package day3;

class Account{
	private int accountId;
	private String accountHolderName;
	private double balance;
	
	/*
	 * static{ System.out.println("This is static init block");
	 * System.out.println("Only runs once irrespective of number of objects"); }
	 * 
	 * { System.out.println("This is init block1");
	 * System.out.println("It runs once for every object");
	 * 
	 * }
	 * 
	 * { System.out.println("This is init block2");
	 * System.out.println("It runs once for every object"); }
	 */
	
	//Constructor Chaining, calling the same class constructor from the constructor
	public Account() {
		this(100,"foo",3000.00);
		System.out.println("It is a default constructor");
	}
	
	public Account(int accountId, String accountHolderName, double balance) {
		System.out.println("It is a parameterized constructor");
		this.accountHolderName = accountHolderName;
		this.accountId = accountId;
		this.balance = balance;
	}
	public void printAccountDetails() {
		System.out.println("account id: "+accountId);
		System.out.println("accountHolderName: "+accountHolderName);
		System.out.println("balance: "+balance);
	}
}

public class DemoBasics {

	public static void main(String[] args) {
		Account account = new Account();
		account.printAccountDetails();
		Account account2 = new Account();
		account2.printAccountDetails();
	}
}
