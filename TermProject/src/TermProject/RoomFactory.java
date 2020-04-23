package TermProject;

import java.util.ArrayList;

/**
 * RoomProvider creates each type of Room (Basic, Deluxe, or Suite)
 * @author Varun Krishna Pappusetti, Aaron Manithep, Edward Huang, Ericka Mae Fajilago
 *
 */
public abstract class RoomFactory {
	/**
	 * Creates an instance of Room based on the type of Room
	 * @param roomType of MotelRoom
	 * @return the Room itself
	 */
	public static MotelRoom getRoom(String roomType, ArrayList<String> roomList) {
		if (roomType.equals("Basic")) {
			return new BasicRoom();
		}
		else if (roomType.contentEquals("Deluxe")) {
			return new DeluxeRoom();
		}
		else if (roomType.contentEquals("Suite")) {
			return new SuiteRoom();
		}
		return null; 
	}
}
