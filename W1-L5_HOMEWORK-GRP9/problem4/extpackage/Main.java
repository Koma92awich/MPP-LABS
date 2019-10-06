package problem4.extpackage;

import java.util.ArrayList;
import java.util.List;

import problem4.CustOrderFactory;
import problem4.Customer;



public class Main {
	public static void main(String[] args) {
		CustOrderFactory factory = new CustOrderFactory();
		
		//Add your order to the ArrayList
		List<String> orderList = new ArrayList<>();
		orderList.add("Shirt");
		orderList.add("Laptop");
		orderList.add("Pants");
		orderList.add("Knife set");
		
		//Pass the orderList to the factory's createCustomer
		Customer cust = factory.createCustomer("Bob", orderList);
		System.out.println(cust.getOrders());
	}
}

		
