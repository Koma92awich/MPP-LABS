/**
 * 
 */
package assignment3.problem2;

/**
 * @author Group 9
 *
 */
public class LandLord {
	
	public static void main(String[] args) {
		Building building = new Building(90.0);
		building.addApartment(new Apartment(70, building));
		building.addApartment(new Apartment(700, building));
		building.addApartment(new Apartment(700, building));
		
		System.out.println(building.calculateProfit());
	}
	
	
}
