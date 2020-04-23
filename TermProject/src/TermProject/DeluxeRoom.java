package TermProject;

import java.util.ArrayList;

public class DeluxeRoom extends MotelRoom {

	public DeluxeRoom() {}

	public DeluxeRoom(String description, boolean doNotDisturb, int roomNumber, ArrayList<String> amenities) {
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
