package libraryPackage;

public class Map extends LibraryItem {
	private String placeName;

	public Map() {
		super();
	}

	public Map(String libItemName, String placeName) {
		super(libItemName);
		setLibItemName(libItemName);
		setPlaceName(placeName);
	}

	@Override
	public String toString() {
		return "Map ItemId: " + getItemId() + " ItemName:" + getLibItemName() + " PlaceName=" + placeName + "\n";
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	@Override
	public void returnDue() {
		System.out.print("1 week");
	}

}
