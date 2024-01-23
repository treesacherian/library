package libraryPackage;

public class Magazine extends LibraryItem {
	private String frequency;

	public Magazine() {
		super();

	}

	public Magazine(String libItemName, String frequency) {
		super(libItemName);
		setFrequency(frequency);
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Override

	public String toString() {
		return "Magazine ItemId: " + getItemId() + " Name :" + getLibItemName() + "  Magazine frequency: "
				+ getFrequency() + "\n";
	}

	@Override
	public void returnDue() {
		System.out.print(" 2 weeks");

	}

}
