package TermProject;

/**
 * The Roach Colony is a colony of roaches that will occupy a MotelRoom
 * @author Varun Krishna Pappusetti, Aaron Manithep, Edward Huang, Erika Mae Fajilago
 * Date: May 7, 2020
 */
public class RoachColony {
	/** Name of colony */
	private String name;
	
	/** Initial population */
	private int population;
	
	/** Growth Rate */
	private double growthRate;
	
	
	public RoachColony() {
		
	}


	public RoachColony(String name, int population, double growthRate) {
		super();
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public double getGrowthRate() {
		return growthRate;
	}


	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}
	
	/**
	 * Party method increases the growth rate and calls the RoachMotel's spray method depending on if 
	 * if their room has a spray resistant shower
	 * @param MotelRoom the roach colony is staying in
	 */
	public void party(MotelRoom room) {
		
	}
	
	

}
