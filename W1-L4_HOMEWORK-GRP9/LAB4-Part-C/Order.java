/**
 * 
 */
package problem4;

import java.time.LocalDate;

/**
 * @author Group 9
 *
 */
public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	public Order(int orderNo,LocalDate orderDate,double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	
	
	public double getOrderAmount() {
		return orderAmount;
	}
}
