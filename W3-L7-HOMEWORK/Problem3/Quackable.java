/**
 * 
 */
package lesson7.labs.prob3;

public interface Quackable {
	default public void quack() {
		System.out.println("Quacking");
	}
}
