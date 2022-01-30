package com.behavioral.parameterization;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//OCP
//classes should be open for extension and close for modification

public class AppleApp {
	public static List<Apple> getAllAppleOnContion(List<Apple> apples, Predicate<Apple> predicate){
		return apples.stream().filter(predicate).collect(Collectors.toList());
	}
}
