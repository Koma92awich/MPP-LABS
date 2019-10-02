/**
 * 
 */
package assignment3.problem2;

/**
 * @author Group 9
 *
 */
public class Apartment {
	private double rent;
	private Building building;
	
	public Apartment(double rent,Building building) {
		this.building = building;
		this.rent = rent;
	}
	
	public double getRent() {
		return rent;
	}
	
	public Building getBuilding() {
		return building;
	}
	
	
	
}
