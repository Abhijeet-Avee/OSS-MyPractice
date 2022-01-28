package com.strategy.dp;
//Change IS-A to HAS-A (composition)
//Shopping cart : payment

import java.util.ArrayList;
import java.util.List;

class Product{}
class Customer{}

interface Payment{
	public double getPayment(String details);
}

class CreditCard implements Payment{

	@Override
	public double getPayment(String details) {
		return 1000.00;
	}
}
class DebitCard implements Payment{

	@Override
	public double getPayment(String details) {
		return 2000.00;
	}
}

class ShoppingCart{
	private List<Product> products;
	private Customer customer;
	private Payment payment;
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public ShoppingCart(String name) {
		products = new ArrayList<Product>();
		customer = new Customer();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void processCart(String details) {
		//....
		payment.getPayment(details);
	}
}

public class StrategyDesignPattern {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart("yash");
		Payment payment = new DebitCard();
		cart.setPayment(payment);
		cart.processCart("12334566");
	}
}
