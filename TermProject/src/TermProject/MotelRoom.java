package TermProject;

import java.util.ArrayList;

/**
 * MotelRoom is a superclass basis for the types of rooms available.
 * @author Varun Krishna Pappusetti, Aaron Manithep, Edward Huang, Ericka Mae Fajilago
 * Date: May 7, 2020
 */
public abstract class MotelRoom {
	
	/** Description of the Room */
	public String description;
	
	/** Whether Do Not Disturb is on */
	public boolean doNotDisturb;
	
	/** The room number */
	public int roomNumber;
	
	/** The amenities */
	public ArrayList<String> amenities;
	
	/** 
	 * No argument constructor 
	 */
	public MotelRoom() {}
	
	/**
	 * Constructor for a MotelRoom
	 * @param description
	 * @param doNotDisturb
	 * @param roomNumber
	 * @param amenities
	 */
	public MotelRoom(String description, boolean doNotDisturb, int roomNumber, ArrayList<String> amenities) {
		super();
		this.description = description;
		this.doNotDisturb = doNotDisturb;
		this.roomNumber = roomNumber;
		this.amenities = amenities;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDoNotDisturb() {
		return doNotDisturb;
	}

	public void setDoNotDisturb(boolean doNotDisturb) {
		this.doNotDisturb = doNotDisturb;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public ArrayList<String> getAmenities() {
		return amenities;
	}

	public void setAmenities(ArrayList<String> amenities) {
		this.amenities = amenities;
	}
	
	/** 
	 * Return the cost of the Room 
	 * @return cost of the Room
	 */
	public abstract double cost();
	
	/**
	 * String description of the class
	 * @return String description
	 */
	public abstract String toString();
	
	
	
	
	
	
}
