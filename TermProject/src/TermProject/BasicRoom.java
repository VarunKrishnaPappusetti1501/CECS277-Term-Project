package TermProject;

import java.util.ArrayList;

/**
 * Basic Room type of the superclass MotelRoom
 * @author Varun Krishna Pappusetti, Aaron Manithep, Edward Huang, Ericka Mae Fajilago
 * Date: May 7, 2020
 */
public class BasicRoom extends MotelRoom {
	/**
	 * No argument constructor for BasicRoom
	 */
	public BasicRoom() {}
	
	/** 
	 * Constructor for a BasicRoom
	 * @param description
	 * @param doNotDisturb
	 * @param roomNumber
	 * @param amenities
	 */
	public BasicRoom(String description, boolean doNotDisturb, int roomNumber, ArrayList<String> amenities) {
		super(description, doNotDisturb, roomNumber, amenities);
	}

	@Override
	public double cost() {
		return 0;
	}

	@Override
	public String toString() {
		return null;
	}

}
