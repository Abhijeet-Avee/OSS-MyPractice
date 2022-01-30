package com.behavioral.parameterization;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class MyClass{
	public static void printMe(String data) {
		System.out.println(data);
	}
}
public class MethodReference{
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("foo","bar","jar");
									//String --> void
		Consumer<String> consumer= name-> System.out.println(name);
		
		//names.stream().forEach(name-> System.out.println(name));
		
		//names.stream().forEach(System.out::println);
		
		names.stream().forEach(MyClass::printMe);
		
		
		
		
		List<Apple> apples = Arrays
				.asList(new Apple("red", 400), new Apple("green", 300), new Apple("green", 200),
				new Apple("red", 250));
												//Apple-->T/F
		Predicate<Apple> greenApplesPredicate= apple-> apple.getColor().equals("green");
		
		Predicate<Apple> greenApplesPredicate2=Apple::isGreen;
		
		Predicate<Apple> greenApplesPredicate3= AppleClass::isGreen;
		
		Predicate<Apple> heavyApplesPredicate3= Apple::isHeavy;
		
		
		Predicate<Apple>p=greenApplesPredicate2.negate();
		

	}

}