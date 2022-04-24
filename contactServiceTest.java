/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import Contact.ContactService;
import Contact.Contact;
import org.junit.jupiter.api.Test;

class contactServiceTest {

	//testing Constructor
	@Test
	void testContactService() {
		ContactService test = new ContactService();
		assertTrue(test.equals(null));
	}
	
	@Test
	void addContactTest() {
		ContactService test = new ContactService();
		Contact me = new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		test.addContact(me);
		assertTrue(test.getContacts().get(0).equals(me));
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		});
	}
	
	@Test
	void removeContactTest() {
		ContactService test = new ContactService();
		Contact me = new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		test.addContact(me);
		test.removeContact("Test000001");
		
		assertTrue(test.getContacts().get(0).equals(null));
	}
	
	@Test
	void changeFirstTest() {
		ContactService test = new ContactService();
		Contact me = new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		test.addContact(me);
		
		test.changeFirst("Test000001", "Bob");
		
		assertTrue(test.getContacts().get(0).getFirst().equals("Bob");	
	}
	
	@Test
	void changeLastTest() {
		ContactService test = new ContactService();
		Contact me = new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		test.addContact(me);
		
		test.changeLast("Test000001", "Joe");
		assertTrue(test.getContacts().get(0).getLast().equals("Joe");
	}
	
	@Test 
	void changePhoneTest() {
		ContactService test = new ContactService();
		Contact me = new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		test.addContact(me);
		
		test.changePhone("Test000001",  "0987654321");
		assertTrue(test.getContacts().get(0).getPhone().equals("0987654321");
	}
	
	@Test
	void changeAddressTest() {
		ContactService test = new ContactService();
		Contact me = new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		test.addContact(me);
		
		test.changeAddress("Test000001",  "Address is Fake");
		assertTrue(test.getContacts().get(0).getAddress().equals("Address is Fake");
		
	}
}
