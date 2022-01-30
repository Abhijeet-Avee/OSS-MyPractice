package com.behavioral.parameterization;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class BookTester{

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 240),
				new Book(11, "python", "ekta", 1840),
				new Book(110, "AI", "foo", 1140),
				new Book(621, "c programming", "gunika", 300)
				);
		
		//i want to get all the books names having cost >=800
		
//		List<String> names=books.stream()
//				.filter(book-> book.getPrice()>=800)
//				.sorted(( o1,  o2)-> Double.compare(o2.getPrice(), o1.getPrice()))
//				.map(book-> book.getTitle())
//				.distinct()
//				.collect(Collectors.toList());
//		
//		names.forEach(name-> System.out.println(name));
//				
				
		List<String> names=books.stream()
				.filter(book-> book.getPrice()>=800)
				.sorted(Comparator.comparing(Book::getPrice).reversed())
				.map(book-> book.getTitle())
				.distinct()
				.collect(Collectors.toList());
		
		names.forEach(name-> System.out.println(name));
		
		
				
				
		//get all the books that are pricy >= 800
		List<Book> costyBooks=BookApp.getBooksOnCondition(books, book-> book.getPrice()>=800);
		
		//costyBooks.stream().forEach( b-> System.out.println(b));
		
		costyBooks.stream().forEach( System.out::println);//? how to think about method ref?
	}
}