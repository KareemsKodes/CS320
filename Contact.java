/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */
package Contact;

public class Contact {
	//creating variables to store data about contact
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Constructor
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		//id shall not be null or longer than 10 characters
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//first name shall not be null or longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		//last name shall not be null or longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		//Phone shall not be null and must be exactly 10 characters
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone");
		}
		
		//Address shall not be null and must be less than or equal to 30 characters
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	//Setter methods for setting variable values
	
	/*ID is not updatable so no setter will be needed
	 * public void setId (String newId){
		id = newId;
	}*/
	
	public void setFirst(String first) {
		//first name shall not be null or longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		firstName = first;
	}
	
	public void setLast (String last) {
		//last name shall not be null or longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		lastName = last;
	}
	
	public void setPhone( String newPhone) {
		//Phone shall not be null and must be exactly 10 characters
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone");
		}
		phone = newPhone;
	}
	
	public void setAddress(String newAddress) {
		//Address shall not be null and must be less than or equal to 30 characters
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		address = newAddress;
	}
	
	//Getter methods for retrieving variable values
	public String getId() {
		return id;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
}
