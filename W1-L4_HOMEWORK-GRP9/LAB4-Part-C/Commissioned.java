/**
 * 
 */
package problem4;

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

	public Commissioned(int empId,double commission, double baseSalary,List<Order> orderList) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orderList;
	}

	@Override
	double calcGrossPay(int month,int year) {
		double totalOrders = this.totalOrders(month,year);
		//double grossPay = baseSalary + ((commission / 100) * totalOrder);
		double grossPay = baseSalary + commission * totalOrders;
		return grossPay;
	}

	/**
	 * Process the total Amount of orders for last month
	 * 
	 * @return
	 */
	private double totalOrders(int month,int year) {
		// Previous Month
		LocalDate ldate = LocalDate.of(year, month, 1);
		int previousMonth = ldate.getMonthValue();
		double totalOrder = 0.0;
		for (Order order : orders) {
			if (order.getOrderDate().getMonthValue() == previousMonth && order.getOrderDate().getYear() == year)
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
