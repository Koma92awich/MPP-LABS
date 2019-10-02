package assignment3.problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Group 9
 *
 */
public class Building {
	
	private List<Apartment> apartments = new ArrayList<Apartment>();
	private double buildingMaintenanceCost;
	
	
	
	public Building(double mCost) {
		this.buildingMaintenanceCost = mCost;
	}
	
	public double calculateProfit() {
		double totalRent = 0.0;
		for(Apartment apartment:apartments)
			totalRent += apartment.getRent();
		return totalRent - buildingMaintenanceCost;
	}
	
	public void addApartment(Apartment apartment) {
		apartments.add(apartment);
	}
	
	
	public double getBuildingMaintenanceCost() {
		return buildingMaintenanceCost;
	}

}
