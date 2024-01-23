package libraryPackage;

import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {

		ArrayList<LibraryItem> libraryItems = new ArrayList<>();
		libraryItems.add(new Book("My Brothers Keeper", "ML Rose"));
		libraryItems.add(new Map("Bus Route", "Edinburgh"));
		libraryItems.add(new Map("Sightseeing", "Edinburgh"));
		libraryItems.add(new Book("Tomorrow, and Tomorrow", "Gabrielle Zevin"));
		libraryItems.add(new Book("The Fall", "Louise Jensen "));
		libraryItems.add(new Magazine("The National Trust Magazine", "Monthly"));
		libraryItems.add(new Magazine("National Geographic", "Weekly"));

		LibraryItem newItem = new Book("Mad Honey", "Jodi Picoult");
		libraryItems.add(newItem);

		for (LibraryItem item : libraryItems)
			System.out.println(item);

		libraryItems.remove(new Book("Tomorrow, and Tomorrow", "Gabrielle Zevin"));

		Library myLibrary = new Library("Livingston Library");
		for (LibraryItem item : libraryItems)
			myLibrary.checkin(item);

		myLibrary.checkoutById(4);
		myLibrary.addNewItem(newItem);
		myLibrary.removeItem(newItem);
		myLibrary.updateItem(2, "Bus Route Map");

		ArrayList<Member> libMembers = new ArrayList<>();

		libMembers.add(new Member("Rishi Sunak", "0756443254", " "));
		libMembers.add(new Member("Liz Truss", "0878654", " "));
		libMembers.add(new Member("Boris Johnson", "05643786", " "));
		libMembers.add(new Member("Teresa May", "011543265", " "));
		libMembers.add(new Member("David Cameron", "09898765", " "));
		libMembers.add(new Member("Gordon Brown", "099987435", " "));
		libMembers.add(new Member("Tony Blair", "04345678", " "));

		for (Member member : libMembers)
			myLibrary.addMember(member);

		myLibrary.removeMemberById(5);
		myLibrary.updateMember(3, "0999999", "123 abc street ");

		System.out.println("\nStock and Members in the library: " + myLibrary.getName() + "\n");

		System.out.println(myLibrary);
		Collections.sort(libraryItems);
		Collections.sort(libMembers);

		System.out.println("Library stock  in name ascending order: \n" + libraryItems);
		System.out.println("Members registered in the library in name ascending order\n" + libMembers);
	}

}