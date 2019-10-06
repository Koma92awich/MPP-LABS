/**
 * 
 */
package problem1;

/**
 * @author SARFO PHILIP
 *
 */
public class MallardDuck extends Duck{

	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}


	@Override
	public void display() {
		System.out.println(" display");
		flyBehavior.fly();
		quackBehavior.quack();
	}

	
	

}
