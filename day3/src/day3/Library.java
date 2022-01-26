package day3;

import java.util.ArrayList;

public class Library {
	private String libraryName;
	private ArrayList<Book> books;
	
	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void printLibraryDetails() {
		System.out.println("-------------");
		System.out.println("LibraryName: "+ libraryName);
		System.out.println("--BOOK LIST------");
		for(Book book: books) {
			book.printBookDetails();
		}
	}
}
