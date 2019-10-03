/**
 * 
 */
package assignment4.problem4;

/**
 * @author Group 9
 *
 */
public abstract class Employee {
	private int empId;

	public void print() {

	}

	public Paycheck calcCompensation() {
		return null;
	}

	abstract double calcGrossPay();

	public int getEmpId() {
		return empId;
	}

}
