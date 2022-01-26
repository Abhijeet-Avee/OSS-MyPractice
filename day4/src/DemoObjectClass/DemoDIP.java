package DemoObjectClass;
//Dependency Inversion Principle

//shopping cart
//Shopping cart [higher level] is dependent on debit card [lower level]
// High level module and low level module should be dependent on interface

interface Payable{
	public void processPayment();
}

class DebitCard implements Payable{
	public void processPayment() {
		System.out.println("Payment via debit card");
	}
}

class CreditCard implements Payable{
	public void processPayment() {
		System.out.println("Payment via credit card");
	}
}

class GooglePay implements Payable{
	public void processPayment() {
		System.out.println("Payment via goggle pay");
	}
}

class ShoppingCart{
	private Payable payable;
	
	public ShoppingCart(Payable payable) {
		this.payable = payable;
	}
	
	public void checkOut() {
		payable.processPayment();
	}
}

public class DemoDIP {
	public static void main(String[] args) {
		Payable card = new DebitCard();			
		//Payable card = new CreditCard(); 
		ShoppingCart cart = new ShoppingCart(card);
		cart.checkOut();
	}
}
