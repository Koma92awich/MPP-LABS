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
	
	public Employee(int empId) {
		this.empId = empId;
	}

	public void print(int month,int year) {
		String details = "Employee Id :"+empId+"\n"
				+ "Paystub: ";
		System.out.println(details);
		Paycheck paycheck = calcCompensation(month,year);
		paycheck.print();
	}

	public Paycheck calcCompensation(int month,int year) {
		return new Paycheck(calcGrossPay(month,year));
	}

	abstract double calcGrossPay(int month,int year);

	

}
