package TermProject;

import java.util.ArrayList;

/**
 * The Roach Motel will be the Singleton in the Singleton Design pattern
 * @author Varun Krishna Pappusetti, Aaron Manithep, Edward Huang, Erika Mae Fajilago
 * Date: May 7, 2020
 */
public class RoachMotel {
	
	/**
	 * Initializing the Singleton object
	 */
	private static RoachMotel roachMotel = new RoachMotel();
	
	/**
	 * Number of Rooms in the roachMotel
	 */
	private int capacity;
	
	/**
	 * Name of the motel
	 */
	private String name;
	
	/**
	 * Check if the Hotel is vacant or not
	 */
	private boolean vacancy;
	
	/**
	 * Available rooms
	 */
	private ArrayList<Integer> availableRooms;
	
	/**
	 * Constructor for the RoachMotel 
	 */
	private RoachMotel() {
		this.setCapacity(5);
		this.setName("The Great Roach Motel");
		this.setVacancy(true); // hotel is empty
	}
	
	/**
	 * Static method to get the only object available
	 * @return RoachMotel object 
	 */
	public static RoachMotel getRoachMotel() {
		return roachMotel;
	} 
	
	/**
	 * Getting the number of Rooms
	 * @return number of Rooms
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * Set the number of Rooms
	 * @param numRooms 
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * Getting the name of RoachMotel
	 * @return the name of the RoachMotel
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setting the name of RoachMotel
	 * @param name of the RoachMotel
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getting the vacancy of the RoachMotel
	 * @return vacancy of the RoachMotel
	 */
	public boolean isVacancy() {
		return vacancy;
	}

	/**
	 * Setting the vacancy of the RoachMotel
	 * @param vacancy of the RoachMotel
	 */
	public void setVacancy(boolean vacancy) {
		this.vacancy = vacancy;
	}
	
}
