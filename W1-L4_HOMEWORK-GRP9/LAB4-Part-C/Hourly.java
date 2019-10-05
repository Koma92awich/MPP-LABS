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

	public Hourly(int empId,double hourWage, int hoursPerWeek) {
		super(empId);
		this.hourWage = hourWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	double calcGrossPay(int month,int year) {
		return hourWage * (hoursPerWeek * 4);
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public double getHourWage() {
		return hourWage;
	}

}
