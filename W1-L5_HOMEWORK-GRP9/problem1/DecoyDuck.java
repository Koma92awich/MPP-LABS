/**
 * 
 */
package problem1;

/**
 * Duck: Decoy Duck
 * @author SARFO PHILIP
 *
 */
public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println(" displaying");
		flyBehavior.fly();
		quackBehavior.quack();
	}

	

}
