package problem1;

/**
 * Read Head Duck
 * @author SARFO PHILIP
 *
 */
public class RedHeadDuck extends Duck{

	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior =  new Quack();
	}

	@Override
	public void display() {
		System.out.println("displaying");
		flyBehavior.fly();
		quackBehavior.quack();
	}



}
