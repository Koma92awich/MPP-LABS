/**
 * 
 */
package lesson7.labs.prob3;

public class DecoyDuck extends Duck {

	@Override
	public void fly() {
		System.out.println("Can not fly");
	}

	@Override
	public void display() {
		System.out.println(" displaying");

	}

	@Override
	public void quack() {

		System.out.println("Can not Quack");
	}

}
