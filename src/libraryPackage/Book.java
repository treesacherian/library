package libraryPackage;

import java.util.ArrayList;

public class Book extends LibraryItem {

	private String author;

	public Book() {

	}

	public Book(String libItemName, String author) {
		super(libItemName);
		setLibItemName(libItemName);
		setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book author=" + author + ", Book Name=" + getLibItemName() + ", ItemId=" + getItemId() + "\n ";
	}

	public void addBook(String name, String author) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(name, author));
		System.out.println("Books in the Library" + books);
	}

	@Override
	public void returnDue() {
		System.out.println("1 month");
	}

}
