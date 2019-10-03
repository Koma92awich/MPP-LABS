/**
 * 
 */
package assignment4.problem4;

import java.time.LocalDate;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int date = LocalDate.now().minusMonths(1).getMonthValue();;
		
		System.out.println(date);
	}

}
