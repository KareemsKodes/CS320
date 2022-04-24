/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */

package Contact;
import java.util.ArrayList;

public class ContactService {
	//list to hold contacts
	private ArrayList<Contact> contacts;
	
	//constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//getter for contacts
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	public void addContact(Contact contact) {
		
		//checking if contact with this id already exists by looping through list of contacts
		for (Contact con : contacts) {
			if (con.getId().equals(contact.getId())) {
				throw new IllegalArgumentException("A Contact With This ID Already Exists");
			}
		}
		
		//if no exception thrown, no matching contact ID exists, therefore, we can add the new contact
		contacts.add(contact);		
	}
	
	public void removeContact(String id) {
		//Boolean to check if contact is removed
		boolean removed = false;
		
		//loop to check all contacts in contact list for contact with matching ID
		for (Contact con : contacts) {
			//if contact id matches supplied ID, then contact is removed from contact list
			if (con.getId().equals(id)) {
				contacts.remove(con);
				System.out.println("Contact removed");
				
				//changing boolean check to true because contact removed
				removed = true;
				break;
			}
		}
		
		//if removed is still false, then no match found so contact does not exist
		if (!removed) {
			throw new IllegalArgumentException("Contact Does Not Exist");
		}
	}
	
	//method to change the first name of a contact
	public void changeFirst(String id, String newFirst) {
		//Boolean to check if contact exists
		boolean exists = false;
		
		//loop to check all contacts in contact list for contact with matching ID
		for (Contact con : contacts) {
			//if contact id matches supplied ID, then contact is updated with supplied info
			if (con.getId().equals(id)) {
				con.setFirst(newFirst);
				System.out.println("First name for " + id + " has been updated");				
				//changing boolean check to true because contact exists
				exists = true;
				break;
			}
		}
		
		//if exists is still false, then no match found so contact does not exist
		if (!exists) {
			throw new IllegalArgumentException("Contact Does Not Exist");
		}		
	}
	
	//method to change the last name of a contact
	public void changeLast(String id, String newLast) {
		//Boolean to check if contact exists
		boolean exists = false;
		
		//loop to check all contacts in contact list for contact with matching ID
		for (Contact con : contacts) {
			//if contact id matches supplied ID, then contact is updated with supplied info
			if (con.getId().equals(id)) {
				con.setLast(newLast);
				System.out.println("Last name for " + id + " has been updated");				
				//changing boolean check to true because contact exists
				exists = true;
				break;
			}
		}
		
		//if exists is still false, then no match found so contact does not exist
		if (!exists) {
			throw new IllegalArgumentException("Contact Does Not Exist");
		}	
	}
	
	//method to change the phone of a contact
	public void changePhone(String id, String newPhone) {
		//Boolean to check if contact exists
		boolean exists = false;
		
		//loop to check all contacts in contact list for contact with matching ID
		for (Contact con : contacts) {
			//if contact id matches supplied ID, then contact is updated with supplied info
			if (con.getId().equals(id)) {
				con.setPhone(newPhone);
				System.out.println("Phone for " + id + " has been updated");				
				//changing boolean check to true because contact exists
				exists = true;
				break;
			}
		}
		
		//if exists is still false, then no match found so contact does not exist
		if (!exists) {
			throw new IllegalArgumentException("Contact Does Not Exist");
		}
	}
	
	//method to change the address of a contact
	public void changeAddress(String id, String newAddress) {
		//Boolean to check if contact exists
		boolean exists = false;
		
		//loop to check all contacts in contact list for contact with matching ID
		for (Contact con : contacts) {
			//if contact id matches supplied ID, then contact is updated with supplied info
			if (con.getId().equals(id)) {
				con.setAddress(newAddress);
				System.out.println("Address for " + id + " has been updated");				
				//changing boolean check to true because contact exists
				exists = true;
				break;
			}
		}
		
		//if exists is still false, then no match found so contact does not exist
		if (!exists) {
			throw new IllegalArgumentException("Contact Does Not Exist");
		}
	}
}
