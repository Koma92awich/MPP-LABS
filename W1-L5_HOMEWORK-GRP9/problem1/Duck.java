/**
 * 
 */
package problem1;

/**
 * Duck
 * @author SARFO PHILIP
 *
 */
public abstract class Duck{
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	public void swim() {
		System.out.println(" swimming");
	}
	abstract public void display();
	
}
