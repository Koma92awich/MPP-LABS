/**
 * 
 */
package problem1;

/**
 * Duck : Rubber Duck
 * @author SARFO PHILIP
 *
 */
public class RubberDuck extends Duck{

	public RubberDuck() {
		
	}
	

	@Override
	public void display() {
		System.out.println("displaying");
		
	}

	@Override
	public void fly() {
		System.out.println("cannot fly");
		
	}

	@Override
	public void quack() {
		System.out.println("squeaking");
		
	}

	@Override
	public void swim() {
		System.out.println("swimming");
		
	}

}
