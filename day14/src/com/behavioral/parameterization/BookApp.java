package com.behavioral.parameterization;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class BookApp {

	public static List<Book> getBooksOnCondition(List<Book> books, Predicate<Book> predicate){
		return books.stream().filter(predicate).collect(Collectors.toList());
	}
	
}