package problem2B;

public class OrderLine {
	private int lineNumber;
	private double price;
	private String quantity;
	private Order order;

	public OrderLine(int lineNumber, double price, String quantity,Order order) {
		this.lineNumber = lineNumber;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public Order getOrder() {
		return order;
	}

	public double getPrice() {
		return price;
	}

	public String getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return "Line number :"+lineNumber+" Price: "+price+" Quantity: "+quantity+" Order: "+order.getOrderNum();
	}

}
