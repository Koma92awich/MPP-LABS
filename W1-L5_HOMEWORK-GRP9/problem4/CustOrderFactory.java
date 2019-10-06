package problem4;

import java.time.LocalDate;
import java.util.List;

/**
 * Customer Order Factory
 * @author SARFO PHILIP
 *
 */
public class CustOrderFactory {
	
	/**
	 * Creates a new customer and order list for the customer
	 * @param customerName
	 * @param orderList
	 * @return
	 */
	public Customer createCustomer(String customerName,List<String> orderList) {
		Customer cust = new Customer(customerName);
		Order order = Order.newOrder(cust, LocalDate.now());
		orderList.forEach(item->{
			order.addItem(item);
		});
		return cust;
	}

}
