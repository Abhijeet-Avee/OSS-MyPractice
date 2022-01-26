package day3;

public class BookInventory {
	public static void main(String[] args) {
		Library lib = new Library("ABC library");
		Book book1 = new Book(112,"JAVA","Abhi",200);
		Book book2 = new Book(222,"PHP","Yash",300);
		
		lib.addBook(book1);
		lib.addBook(book2);
		
		lib.printLibraryDetails();
	}
}
