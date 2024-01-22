package libraryPackage;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<LibraryItem> items = new ArrayList<>();
	private ArrayList<Member> members = new ArrayList<>();

	public Library() {
		super();
	}

	public Library(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<LibraryItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<LibraryItem> items) {
		this.items = items;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public int itemsCount() {
		return this.items.size();
	}

	public int membersCount() {
		return this.members.size();
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}

	public void checkout(LibraryItem item) {
		items.remove(item);
	}

	public void checkin(LibraryItem item) {
		items.add(item);
	}

	public void checkoutById(int id) {
		for (LibraryItem item : items) {

			if (id == item.getItemId()) {
				System.out.print(" Below item has been successfully checked out" + item + " It is due in ");
				item.returnDue();
				this.items.remove(item);
				return;
			}

		}

	}

	public void addMember(Member member) {
		members.add(member);
	}

	public void removeMember(Member member) {
		members.remove(member);
	}

	public void removeMemberById(int id) {
		for (Member member : members) {
			if (id == member.getId()) {
				this.members.remove(member);
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Library [name=" + name + "\n items available in the library " + this.items.size() + "\n" + items + "\n"
				+ "Members registered in the library: " + this.members.size() + "\n" + members;
	}

	public void updateMember(int id, String contactNumber, String address) {
		// TODO Auto-generated method stub
		for (Member member : members) {
			if (id == member.getId())
				member.setContactNumber(contactNumber);
			member.setAddress(address);
			return;
		}
	}

	public void addNewItem(LibraryItem item) {
		items.add(item);

	}

	public void removeItem(LibraryItem item) {
		items.remove(item);

	}

}
