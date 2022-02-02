package com.book.casestudy;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
//		List<Book> booksMoreThne400Pages=
//				allBooks
//				.stream()
//				.filter(BookUtil::isLengthyBook)
//				.collect(toList());
//		booksMoreThne400Pages.forEach(b-> System.out.println(b));
//		
		
		// 2. Find all books that are java books and more then 400 pages
		//Predicate<Book> p1=book-> book.getPages()>=400;
//		Predicate<Book> p2=book-> book.getSubject()==Subject.JAVA;
		
//		
//		
//		List<Book> booksMoreThne400Pages=
//				allBooks
//				.stream()
//				.filter(p1.and(p2))
//				.collect(toList());
//		booksMoreThne400Pages.forEach(b-> System.out.println(b));
//		
		
		
		// 3. We need the top three longest books
		
//			List<Book> booksMoreThne400Pages=
//			allBooks
//			.stream()
//			.filter(BookUtil::isLengthyBook)
//			.sorted(( book1,  book2)-> Integer.compare(book2.getPages(), book1.getPages()))
//			.limit(2)
//			.collect(toList());
	
		
//		List<Book> booksMoreThne400Pages=
//				allBooks
//				.stream()
//				.filter(BookUtil::isLengthyBook)
//				.sorted(Comparator.comparing( Book::getPages))
//				.limit(2)
//				.collect(toList());
	
			//booksMoreThne400Pages.forEach(b-> System.out.println(b));
		
		// 4. We need from the fourth to the last longest books
//			List<Book> booksMoreThne400Pages2=
//					allBooks
//					.stream()
//					.filter(BookUtil::isLengthyBook)
//					.sorted(Comparator.comparing( Book::getPages))
//					.skip(3)
//					
//					.collect(toList());
//		
//			booksMoreThne400Pages2.forEach(b-> System.out.println(b));
			//System.out.println("-----------");
				
		// 5. We need to get all the publishing years

			//stream of books--> stream of int
		
			
			
//			List<Integer> allPubYear=
//					allBooks.
//					stream()
//					.map(b-> b.getYear())
//					.distinct()
//					.collect(toList());
//			
//			allPubYear.forEach(year-> System.out.println(year));
		    //print all the authors name
// 6. We need all the authors names who have written a book	
//			allBooks.stream()
//			.flatMap(b-> b.getAuthors().stream())
//			.map(a-> a.getName())
//			.forEach(name-> System.out.println(name));
//			
			
			
		
	
		// We need all the origin countries of the authors
				//self
			
		// We want the most recent published book.
	
			Optional<Book> optBook = allBooks
			.stream()
			.min(Comparator.comparing(Book::getYear));
			
			String name=optBook.map(b-> b.getTitle()).orElse("not found");
			System.out.println(name);
			
			
		// We want to know if all the books are written by more than one author? boolean
			
			boolean isAllBooksWrittenByMoreThenOneAuthor = allBooks
			.stream()
			.allMatch(b-> b.getAuthors().size()> 1);
			
			//System.out.println(isAllBooksWrittenByMoreThenOneAuthor);
			
			int arr[]= {5,7,11,13,89};
			
			//none match
			
			if(Arrays.stream(arr).noneMatch(n-> n%2==0)) {
				System.out.println("we dont find any even no");
			}else {
				System.out.println("you have find it");
			}
			
			
			
			//is all the elements of array are odd?
			
//			boolean isAllAreOdd= Arrays
//					.stream(arr)
//					.allMatch(no-> no%2!=0);
//			
//			System.out.println(isAllAreOdd);
	
//			
//					OptionalInt findAny = Arrays
//					.stream(arr)
//					.filter(no-> no%2==0)
//					.findAny();
//					
//				System.out.println(findAny.orElseThrow(RuntimeException::new));	
			
		// We want one of the books written by more than one author.? (findAny)
			
		
//					allBooks.stream().filter(b->b.getAuthors().size()>1)
//			.findAny().flatMap(b-> b.getAuthors().stream());
		
		// We want the total number of pages published.
			//reduction vs accumulation (disucssess : || streams)
			//5,7,11,13,89,70, 6, 34
			//5,7,11,13		5,7,11,13
			//0+5+7   11,13			5,7		11,13
			
			//reduction 
//			Integer noOfPages = allBooks
//			.stream()
//			.map(b-> b.getPages())
//			.reduce(0, ( x,  y)-> x+y);
//			System.out.println(noOfPages);
			
			
//			Integer noOfPages = allBooks
//			.stream()
//			.map(b-> b.getPages())
//			.su
//			
			
//			Integer noOfPages = allBooks
//					.stream()
//					.mapToInt(b-> b.getPages())
//					.sum();
//			
//					System.out.println(noOfPages);
	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
			
			Double pages = allBooks
			.stream()
			.collect(Collectors.averagingInt(Book::getPages));
			
			System.out.println(pages);
	
		// We want all the titles of the books

		//all tiles print : java , adv c#, 
			String allBooksName = allBooks.stream()
			.map(b-> b.getTitle())
			.collect(Collectors.joining("     "));
			
			System.out.println(allBooksName);
	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.

			Map<Integer, List<Book>> map = allBooks
			.stream()
			.collect(Collectors.groupingBy(Book::getYear));
			
		
			map.entrySet().stream().forEach(
					entry-> {
					System.out.println(entry.getKey());
					entry.getValue().forEach(b-> System.out.println(b));
				
			});
			
		// We want a Map of book per year and then by subject
		
			Map<Integer, Map<Subject, List<Book>>> collect = allBooks
					.stream()
					.collect(groupingBy(Book::getYear,groupingBy(Book::getSubject)));
	
			
		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(
				new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in")
				);

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2021, "1213"));
		books.add(new Book("adv java", authors1, 400, Subject.JAVA, 2021, "1213"));
		
		books.add(new Book("adv C#", authors2, 700, Subject.DOT_NET, 2022, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2019, "1293"));

		return books;
	}

}