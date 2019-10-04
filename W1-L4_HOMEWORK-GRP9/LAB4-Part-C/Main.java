/**
 * 
 */
package problem4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Order> list = new ArrayList<Order>();
		list.add(new Order(100,LocalDate.of(2019,9,1),200.0));
		list.add(new Order(100,LocalDate.of(2019, 9, 10),100.0));
		Commissioned cm = new Commissioned(0.8, 500, list);
		Employee[] emp = {new Salaried(4000),new Hourly(15.67, 20),cm};
		for(Employee e : emp)
			e.print(10, 2019);
	}

}
