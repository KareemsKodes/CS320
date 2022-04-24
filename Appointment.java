/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */



package Appointment;
import java.util.Date;

public class Appointment {
	private String id;
	private Date date;
	private String description;
	
	public Appointment (String id, Date date, String description) {
		//id shall not be null or longer than 10 characters
		if (id.length() > 10 || id == null) {
			throw new IllegalArgumentException("Invalid ID");
		}
		//date shall not be in the past or null
		if (date.before(new Date()) || date == null){
			throw new IllegalArgumentException("Invalid Date");
		}
		//description shall not be greater than 50 characters or null
		if (description.length() > 50 ||  description == null) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.id = id;
		this.date = date;
		this.description = description;
	}
	
	//getter methods
	public String getId() {
		return id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	
	//setter methods for updatable variables
	public void setDate(Date date) {
		if (date.before(new Date()) || date == null){
			throw new IllegalArgumentException("Invalid Date");
		}
		this.date = date;
	}
	
	public void setDescription(String description) {
		if (description.length() > 50 ||  description == null) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = description;
	}
}
