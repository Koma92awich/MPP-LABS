/**
 * 
 */
package problem4;

/**
 * @author Group 9
 *
 */
public class Hourly extends Employee {

	private double hourWage;
	private int hoursPerWeek;

	public Hourly(double hourWage, int hoursPerWeek) {
		this.hourWage = hourWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	double calcGrossPay() {
		return hourWage * (hoursPerWeek * 4);
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public double getHourWage() {
		return hourWage;
	}

}
