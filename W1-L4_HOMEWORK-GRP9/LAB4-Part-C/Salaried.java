/**
 * 
 */
package assignment4.problem4;

/**
 * @author 610488
 *
 */
public class Salaried extends Employee{
	private double salary;
	
	public Salaried(double salary) {
		this.salary = salary;
	}

	@Override
	double calcGrossPay() {
		return salary;
	}
	
	public double getSalary() {
		return salary;
	}

}
