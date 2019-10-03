/**
 * 
 */
package assignment4.problem4;

import java.time.LocalDate;

/**
 * @author Group 9
 *
 */
public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Commissioned commissioned;
	
	public Order(int orderNo,LocalDate orderDate,double orderAmount,
			Commissioned commissioned) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissioned = commissioned;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	public Commissioned getCommissioned() {
		return commissioned;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
}
