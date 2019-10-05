/**
 * 
 */
package problem4;

/**
 * @author 610488
 *
 */
public final class Paycheck {
	private double grossPay;
	private final double fica = 0.23;
	private final double state = 0.05;
	private final double local = 0.01;
	private final double medicare = 0.03;
	private final double socialSecurity = 0.075;

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
	}

	

	public double getFica() {
		return fica;
	}



	public double getState() {
		return state;
	}



	public double getLocal() {
		return local;
	}



	public double getMedicare() {
		return medicare;
	}



	public double getSocialSecurity() {
		return socialSecurity;
	}



	public void print() {
		String result = "Gross Pay: "+grossPay+"\n"
						+ "Fica: "+getFica()+"\n"
						+ "State: "+getState()+"\n"
						+ "Local: "+getLocal()+"\n"
						+ "Medicare "+getMedicare()+"\n"
						+ "Social Security: "+getSocialSecurity()+"\n"
						+ "NET PAY: "+getNetPay()+"\n";
		
		System.out.println(result);
	}

	public double getNetPay() {
		double taxes = (getFica() + getState() + getLocal() + getMedicare() + getSocialSecurity()) * grossPay;
		return grossPay - taxes;
	}

}
