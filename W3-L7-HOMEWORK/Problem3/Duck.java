/**
 * 
 */
package lesson7.labs.prob3;

public abstract class Duck implements Flyable, Quackable {
	abstract public void display();

	public void swim() {
		System.out.println(" swimming");
	}

}
