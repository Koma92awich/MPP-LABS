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
	private final double fica = 23;
	private final double state = 5;
	private final double local = 1;
	private final double medicare = 3;
	private final double socialSecurity = 7.5;

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getFica() {
		return (fica / 100) * grossPay;
	}

	public double getState() {
		return (state / 100) * grossPay;
	}

	public double getLocal() {
		return (local / 100) * grossPay;
	}

	public double getMedicare() {
		return (medicare / 100) *grossPay;
	}

	public double getSocialSecurity() {
		return (socialSecurity / 100) * grossPay;
	}

	public void print() {
		String result = "Gross Pay: "+grossPay+"\n"
						+ "Fica: "+getFica()+"\n"
						+ "State: "+getState()+"\n"
						+ "Local: "+getLocal()+"\n"
						+ "Medicare "+getMedicare()+"\n"
						+ "Social Security: "+getSocialSecurity()+"\n"
						+ "NET PAY: "+getNetPay();
		
		System.out.println(result);
	}

	public double getNetPay() {
		return grossPay - getFica() - getState() - getLocal() - getMedicare() - getSocialSecurity();
	}

}
