package com.book.casestudy;

public class BookUtil {

	public static boolean isLengthyBook(Book book) {
		return book.getPages()>=400;
	}
}