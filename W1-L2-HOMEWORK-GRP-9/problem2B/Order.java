package problem2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private LocalDate orderDate;
	private List<OrderLine> orderLines = new ArrayList<OrderLine>();

	
	//package level
	public Order(int orderNum,LocalDate orderDate) {
		this.orderNum = orderNum;
		this.orderDate = orderDate;
	}
	
	public void addOrderLine(OrderLine orderLine) {
		orderLines.add(orderLine);
	}
	
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	public void display() {
		orderLines.forEach(e->{
			System.out.println(e);
		});
	}
	
	
	
	@Override
	public String toString() {
		return "Order Number: "+orderNum+" Order Date : "+orderDate.toString();
	}
	
}
