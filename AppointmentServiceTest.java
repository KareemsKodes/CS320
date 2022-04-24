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

class AppointmentServiceTest {

	//checking constructor
		@Test
		void testServiceClass() {
			AppointmentService test = new AppointmentService();
			assertTrue(test.equals(null));
		}
		
		//checking addTask
		@Test
		void testAdd() {
			AppointmentService test = new AppointmentService();
			Date testDate = new Date(4, 4, 2022);
			test.addAppointment("1234", testDate, "TestDesc");
			Appointment testAppointment = new Appointment("1234", testDate, "TestDesc");
			assertTrue(test.getList().get(0).equals(testAppointment));
			
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				test.addAppointment("1234", testDate, "TestDesc");
			});
		}
		
		//checking removeTask
		@Test
		void testRemove() {
			AppointmentService test = new AppointmentService();
			Date testDate = new Date(4, 4, 2022);
			test.addAppointment("1234", testDate, "TestDesc");
			test.removeAppointment("1234");
			assertTrue(test.equals(null));
			
			test.addAppointment("1234", testDate, "TestDesc");
			test.removeAppointment("1235");
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				test.removeAppointment("123");
			});
		}

}
