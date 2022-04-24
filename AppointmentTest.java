/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;
import Appointment.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	@Test
	void testAppointmentClass() {
		Date testDate = new Date(4, 4, 2022);
		Appointment test = new Appointment("1234567890",testDate, "Test" );
		assertTrue(test.getId().equals("1234567890"));
		assertTrue(test.getDate().equals(testDate));
		assertTrue(test.getDescription().equals("Test"));
	}
	
	//checking id length and null
	@Test
	void testId() {
		//checking length <=10
		Date testDate = new Date(4, 4, 2022);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("12345678901", testDate, "TestDescription");
		});
		//checking must not be null
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment(null, testDate, "TestDescription");
		});
	}
	
	//checking date before and null
	@Test
	void testDate() {
		//checking before
		Date testDate = new Date(4, 2, 2022);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("1234567890", testDate, "TestDescription");
		});
		//checking must not be null
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("12345", null, "TestDescription");
		});
	}
	
	//checking description length and null
	@Test
	void testDescription() {
		//checking length
		Date testDate = new Date(4, 4, 2022);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("1234567890", testDate, "123456789012345678901234567890123456789012345678901");
		});
		//checking must not be null
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("12345", testDate, null);
		});
	}
}
