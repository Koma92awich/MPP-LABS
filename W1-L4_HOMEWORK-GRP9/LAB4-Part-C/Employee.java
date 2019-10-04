/**
 * 
 */
package problem4;

/**
 * @author Group 9
 *
 */
public abstract class Employee {
	private int empId;

	public void print(int month,int year) {
		String details = "Employee Id :"+empId+"\n"
				+ "Paystub: ";
		System.out.println(details);
		Paycheck paycheck = calcCompensation();
		paycheck.print();
	}

	public Paycheck calcCompensation() {
		return new Paycheck(calcGrossPay());
	}

	abstract double calcGrossPay();

	

}
