/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */
package Task;

public class Task {
	//Declaring private variables 
	private String id;
	private String name;
	private String description;
	
	//Constructor
	public Task(String id, String name, String description) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	//getter methods for variables
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	//setter methods for updatable variables
	
	public void setName(String name) {
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		
		this.name = name;
	}
	
	public void setDescription(String description) {
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.description = description;
	}
}
