
public class BuddyInfo {

	String name; 
	String address; 
	String phoneNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		BuddyInfo bo = new BuddyInfo();
		bo.setName("Homer");
		System.out.println("Hello " +bo.getName());
	}

}
