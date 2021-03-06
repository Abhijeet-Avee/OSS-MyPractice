package com.decorator.dp;

//Greet: good morning, special good morning, new year sp good morning
//Pizza : basicPizza, CheezToppingPizza,VegCgeezToppingPizza...

interface Greet {
	String sayGreet();
}

class SimpleGreet implements Greet {
	@Override
	public String sayGreet() {
		return "good morning";
	}
}

class SpecialGreet implements Greet {
	private Greet greet;

	public SpecialGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String sayGreet() {
		return "special " + greet.sayGreet();
	}
}

class NewYearGreet implements Greet {
	private Greet greet;

	public NewYearGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String sayGreet() {
		return "new year " + greet.sayGreet();
	}
}

public class DemoDecorator {
	public static void main(String[] args) {
		Greet greet = new NewYearGreet(new SpecialGreet(new SimpleGreet()));

		System.out.println(greet.sayGreet());
	}
}
