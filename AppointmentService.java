/* Name: Kareem Elkwae
 * Date: 4/11/2022
 * Version: 2
 * SNHU CS320
 */
package Appointment;

import java.util.Date;
import java.util.ArrayList;

public class AppointmentService {
	private ArrayList<Appointment> appointments;
	
	public AppointmentService() {
		appointments = new ArrayList<> ();
	}
	
	public ArrayList<Appointment> getList() {
		return appointments;
	}
	
	public void addAppointment(String id, Date date, String description) {
		//checking list for duplicate ids
		for (Appointment appointment : appointments) {
			if (appointment.getId().equals(id)) {
				throw new IllegalArgumentException("Duplicate ID Found");
			}
		}
		
		//if no duplicate id found, add appointment
		Appointment temp = new Appointment(id, date, description);
		appointments.add(temp);
	}
	
	public void removeAppointment(String id) {
		//boolean to check if appointment exists
		boolean exists = false;
		
		//checking list for matching id
		for (Appointment appointment : appointments) {
			if (appointment.getId().equals(id)) {
				appointments.remove(appointment);
				exists = true;
				break;
			}
		}
		
		//if no matching task found
		if(!exists) {
			throw new IllegalArgumentException("No Matching Task Found");
		}
	}
	
}
