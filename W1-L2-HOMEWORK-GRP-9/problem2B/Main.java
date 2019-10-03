package problem2B;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Order order1 = new Order(1,LocalDate.now(),17, 9.0, "9");
		
		order1.addOrderLine(new OrderLine(1, 9.0, "9",order1));
		order1.addOrderLine(new OrderLine(2, 12.0, "92",order1));
		order1.addOrderLine(new OrderLine(3, 9.0, "93",order1));
		
		OrderLine orderLine = new OrderLine(4, 79.0, "90",order1);
		orderLine.setOrder(order1);
		
		order1.display();
		
		System.out.println("\n\n "+order1);
		

	}

}
