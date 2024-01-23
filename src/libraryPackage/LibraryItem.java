package libraryPackage;

public abstract class LibraryItem implements Comparable<LibraryItem> {

	private String libItemName;
	private int itemId;
	public static int count = 1;

	public LibraryItem() {
		super();
		setItemId(count++);
	}

	public LibraryItem(String libItemName) {
		super();
		setItemId(count++);
		setLibItemName(libItemName);
	}

	public abstract void returnDue();

	@Override
	public String toString() {
		return "LibraryItem [libItemName=" + libItemName + ", itemId=" + itemId + "]";
	}

	public String getLibItemName() {
		return libItemName;
	}

	public void setLibItemName(String libItemName) {
		this.libItemName = libItemName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		LibraryItem.count = count;
	}

	@Override
	public int compareTo(LibraryItem o) {

//comparing a string fields
		return o.libItemName.compareTo(this.libItemName) * -1;

	}

//	public void update(int id, String name) {
//		if (id == itemId) {
//			setLibItemName(name);
//
//		}
//	}
}
