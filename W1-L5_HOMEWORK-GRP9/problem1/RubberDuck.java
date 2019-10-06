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
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println(" displaying");
		flyBehavior.fly();
		quackBehavior.quack();
	}


}
