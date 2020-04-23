package TermProject;
/**
 * RoomProvider creates each type of Room (Basic, Deluxe, or Suite)
 * @author Varun Krishna Pappusetti, Aaron Manithep, Edward Huang, Ericka Mae Fajilago
 *
 */
public abstract class RoomProvider {
	/**
	 * Creates an instance of Room based on the type of Room
	 * @param roomType of Room
	 * @return the Room itself
	 */
	public static Room getRoom(String roomType) {
		if (roomType.equals("Basic")) {
			return new BasicRoom();
		}
		else if (roomType.contentEquals("Deluxe")) {
			return new DeluxeRoom();
		}
		else if (roomType.contentEquals("Suite")) {
			return new SuiteRoom();
		}
	}
}
