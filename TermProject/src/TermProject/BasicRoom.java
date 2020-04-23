package TermProject;

import java.util.ArrayList;

public class BasicRoom extends MotelRoom {
	
	
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
