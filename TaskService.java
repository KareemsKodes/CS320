/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */

package Task;
import java.util.ArrayList;

public class TaskService {
	private ArrayList<Task> tasks;
	
	//constructor
	public TaskService () {
		tasks = new ArrayList<> ();
	}
	
	//getter for TaskService List
	public ArrayList<Task> getList() {
		return tasks;
	}
	
	public void addTask(String id, String name, String description) {
		//checking list of tasks for task with id matching supplied id
		for (Task task : tasks) {
			if (task.getId().equals(id)) {
				throw new IllegalArgumentException("A Task With This ID Already Exists");
			}
		}
		
		//If no matching task is found, add task is added to the list
		Task temp = new Task(id, name, description);
		tasks.add(temp);
	}
	
	public void removeTask(String id) {
		//boolean to record if task exists
		boolean exists = false;
		
		//checking list for matching task ID, if it exists, remove task
		for (Task task : tasks) {
			if (task.getId().equals(id)) {
				tasks.remove(task);
				exists = true;
				break;
			}
		}
		
		//if no matching task found
		if(!exists) {
			throw new IllegalArgumentException("No Matching Task Found");
		}
	}
	
	public void updateName(String id, String name) {
		//Creating a boolean to record if task is found
		boolean exists = false;
		
		//looping through tasks to check for task with matching id
		for (Task task : tasks) {
			//if match found
			if (task.getId().equals(id)) {
				//set new value
				task.setName((name));
				//record task was found
				exists = true;
				break;
			}
		}
		
		//if task was not found
		if (!exists) {
			throw new IllegalArgumentException("No Matching Task Found");
		}
	}
	
	public void updateDescription(String id, String description) {
		//Creating a boolean to record if task is found
		boolean exists = false;
		
		//looping through tasks to check for task with matching id
		for (Task task : tasks) {
			//if match found
			if (task.getId().equals(id)) {
				//set new value
				task.setDescription((description));
				//record task was found
				exists = true;
				break;
			}
		}
		
		//if task was not found
		if (!exists) {
			throw new IllegalArgumentException("No Matching Task Found");
		}
	}
}
