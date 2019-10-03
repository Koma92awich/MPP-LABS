/**
 * 
 */
package assignment4.problem4;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Group 9
 *
 */
public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(double commission, double baseSalary) {
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	@Override
	double calcGrossPay() {
		double totalOrder = this.totalOrders();
		double grossPay = baseSalary + ((commission / 100) * totalOrder);
		return grossPay;
	}

	/**
	 * Process the total Amount of orders for last month
	 * 
	 * @return
	 */
	private double totalOrders() {
		// Previous Month
		int previousMonth = LocalDate.now().minusMonths(1).getMonthValue();
		double totalOrder = 0.0;
		for (Order order : orders) {
			if (order.getOrderDate().minusMonths(1).getMonthValue() == previousMonth)
				totalOrder += order.getOrderAmount();
		}
		return totalOrder;
	}

	public double getCommission() {
		return commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

}
