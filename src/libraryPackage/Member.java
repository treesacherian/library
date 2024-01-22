package libraryPackage;

public class Member implements Comparable<Member> {

	private String memberName;
	public static int count = 1;
	private int id;
	private String contactNumber;
	private String address;

	public Member() {
		super();
		setId(count++);
	}

	public Member(String memberName, String contactNumber, String address) {
		super();
		setMemberName(memberName);
		setContactNumber(contactNumber);
		setAddress(address);
		setId(count++);
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Member Name=" + memberName + ",Member id=" + id + ", contactNumber=" + contactNumber + ", address="
				+ address + "\n";
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public int compareTo(Member o) {

//comparing a string fields
		return o.memberName.compareTo(this.memberName) * -1;

	}

}
