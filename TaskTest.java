/* Name: Kareem Elkwae
 * Date: 3/26/2022
 * Version: 1
 * SNHU CS320
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import Task.Task;
import org.junit.jupiter.api.Test;

class TaskTest {

	//checking constructor
	@Test
	void testTaskClass() {
		Task test = new Task("1234567890", "TestName", "TestDescription");
		assertTrue(test.getId().equals("1234567890"));
		assertTrue(test.getName().equals("TestName"));
		assertTrue(test.getDescription().equals("TestDescription"));
	}
	
	//checking task class ID length and null
	@Test
	void testTaskId() {
		//checking length must be no longer than 10
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("12345678901", "TestName", "TestDescription");
		});
		//checking must not be null
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task(null, "TestName", "TestDescription");
		});
	}
	
	//checking task class name length and null
	@Test
	void testTaskName() {
		//checking length must be no longer than 20
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("1234567890", "123456789012345678901", "TestDescription");
		});
		
		//checking must not be null
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("1234567890", null, "TestDescription");
		});
	}
	
	//checking task class description length and null
	@Test
	void testTaskDescription() {
		//checking length must be no longer than 50
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("1234567890", "TestName", "123456789012345678901234567890123456789012345678901");
		});
		//checking must not be null
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("1234567890", "TestName", null);
		});
	}

}
