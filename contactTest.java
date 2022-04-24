/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Contact.Contact;

class contactTest {

	//Checking constructor and asserting all values pass properly
	@Test
	void testContactClass() {
		Contact contact = new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		assertTrue(contact.getId().equals("Test000001"));
		assertTrue(contact.getFirst().equals("Kareem"));
		assertTrue(contact.getLast().equals("Elkwae"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("Fake Address Here"));
	}
	
	//checking ID length exception throws correctly
	@Test
	void testContactClassIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test000001", "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		});
	}

	//checking ID null exception throws properly
	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, "Kareem", "Elkwae", "1234567890", "Fake Address Here");
		});
	}
	
	//checking First name length exception throws properly
	@Test
	void testContactClassFirstLength() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem12345", "Elkwae", "1234567890", "Fake Address Here");
		});
	}
	
	//checking First Name null exception throws properly
	@Test
	void testContactClassFirstNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", null, "Elkwae", "1234567890", "Fake Address Here");
		});
	}
	
	//checking Last name length exception throws
	@Test
	void testContactClassLastLength() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem", "Elkwae12345", "1234567890", "Fake Address Here");
		});
	}
	
	//Checking Last name null exception throws
	@Test
	void testContactClassLastNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem", null, "1234567890", "Fake Address Here");
		});
	}
	
	//Checking Phone length exception throws for too short and too long
	@Test
	void testContactClassPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem", "Elkwae", "123456789", "Fake Address Here");
		});
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem", "Elkwae", "12345678901", "Fake Address Here");
		});
	}
	
	//Checking phone null exception throws
	@Test
	void testContactClassPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem", "Elkwae", null, "Fake Address Here");
		});
	}
	
	//Checking Address length exception throws
	@Test
	void testContactClassAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem", "Elkwae", "1234567890", "Fake123456789012345678901234567890");
		});
	}
	
	//checking Address null exception throws
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Test00001", "Kareem", "Elkwae12345", "1234567890", null);
		});
	}
}
