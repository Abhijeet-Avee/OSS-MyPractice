package com.behavioral.parameterization;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleTester {

	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(new Apple("red", 400), new Apple("green", 300), new Apple("green", 200),
				new Apple("red", 250));
		
		List<Apple> applesGreen = AppleApp.getAllAppleOnContion(apples, apple -> apple.getColor().equals("green"));

		for (Apple apple : applesGreen) {
			System.out.println(apple);
		}

		List<Apple> applesHeavy = AppleApp.getAllAppleOnContion(apples, apple -> apple.getWeight() >= 250);

		System.out.println("--------all heavy apples---------");

		for (Apple apple : applesHeavy) {
			System.out.println(apple);
		}

		// I need green or heavy apple

		Predicate<Apple> p1 = apple -> apple.getColor().equals("green");
		Predicate<Apple> p2 = apple -> apple.getWeight() >= 250;

		Predicate<Apple> greenOrHeavyPredicate = p1.or(p2);

		List<Apple> heafyOrGreenApples = AppleApp.getAllAppleOnContion(apples, greenOrHeavyPredicate);

		System.out.println("--------all green or heavy apples---------");

		for (Apple apple : heafyOrGreenApples) {
			System.out.println(apple);
		}
		Predicate<Apple> greenAndHeavyPredicate = p1.and(p2);

		List<Apple> heafyAndGreenApples = AppleApp.getAllAppleOnContion(apples, greenAndHeavyPredicate);

		System.out.println("--------all green and heavy apples---------");

		for (Apple apple : heafyAndGreenApples) {
			System.out.println(apple);
		}
	}
}
