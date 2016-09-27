import java.util.*;

public class AddressBook {

	private Set<BuddyInfo> buddies = new HashSet<BuddyInfo>();
	
	public void addBuddy(BuddyInfo b){
		buddies.add(b);
	}
	
	public void removeBuddy(BuddyInfo b){
		buddies.remove(b);
	}
	
	public void useless(){
		//well isn't this great
	}
	
	public static void main(String args[]) { 
		//this is my main method isn't it lovely
		//newchange
		System.out.println("Address book");
		AddressBook addressBook = new AddressBook();
		BuddyInfo buddy = new BuddyInfo();
		addressBook.buddies.add(buddy);
		addressBook.buddies.remove(buddy);
	}
}
