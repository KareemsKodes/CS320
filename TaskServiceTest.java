/* Name: Kareem Elkwae
 * Date: 3/26/2022
 * Version: 1
 * SNHU CS320
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import Task.*;
import org.junit.jupiter.api.Test;

class TaskServiceTest {
	
	//checking constructor
	@Test
	void testTaskServiceClass() {
		TaskService test = new TaskService();
		assertTrue(test.equals(null));
	}
	
	//checking addTask
	@Test
	void testAddTask() {
		TaskService test = new TaskService();
		test.addTask("1234", "TestName", "TestDesc");
		Task testTask = new Task("1234", "TestName", "TestDesc");
		assertTrue(test.getList().get(0).equals(testTask));
		
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			test.addTask("1234", "TestName", "TestDesc");
		});
	}
	
	//checking removeTask
	@Test
	void testRemoveTask() {
		TaskService test = new TaskService();
		test.addTask("1234", "TestName", "TestDesc");
		test.removeTask("1234");
		assertTrue(test.equals(null));
		
		test.addTask("1234", "TestName", "TestDesc");
		test.addTask("1235");
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			test.removeTask("123");
		});
	}
	
	//checking updateName
	@Test
	void testUpdateName() {
		TaskService test = new TaskService();
		test.addTask("1234", "TestName", "TestDesc");
		test.updateName("1234", "NewName");
		Task testTask = new Task("1234", "NewName", "TestDesc");
		assertTrue(test.getList().get(0).equals(testTask));
		
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			test.updateName("123", "MyName");
		});
	}
	
	//Checking updateDescription
	@Test
	void testUpdateDescription() {
		TaskService test = new TaskService();
		test.addTask("1234", "TestName", "TestDesc");
		test.updateDescription("1234", "NewDesc");
		Task testTask = new Task("1234", "TestName", "NewDesc");
		assertTrue(test.getList().get(0).equals(testTask));
		
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			test.updateDescription("123", "MyDesc");
		});
	}

}
