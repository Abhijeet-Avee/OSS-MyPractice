package com.behavioral.parameterization;

import java.util.*;
import java.util.stream.Collectors;

public class DishTester{
	
	public static void main(String[] args) {
		List<Dish> allDishes=getAllDishes();
//		for(Dish dish: allDishes) {
//			System.out.println(dish);
//		}
		//Return the names of dishes that are low in calories (<400),
		//Sorted by number of calories
		
		//java 7:
		
		List<String> dishNames=allDishes.stream()
				.filter(dish-> dish.getCalories()<=400)
				.sorted(Comparator.comparing(Dish::getCalories))
				.map(Dish::getName)
				.distinct()
				//.skip(1)
				.collect(Collectors.toList());
		dishNames.forEach(dname-> System.out.println(dname));
		
		//we need name and calories
		
		List<DishSelectedField> dishSelectedFields
		=allDishes.stream()
		.map(dish-> new DishSelectedField(dish.getName(), dish.getCalories()))
		.collect(Collectors.toList());
		
		
		dishSelectedFields.stream().parallel().forEach(System.out::println);
		
	}
	

	
	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 1900, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		return disheds;
	}
}