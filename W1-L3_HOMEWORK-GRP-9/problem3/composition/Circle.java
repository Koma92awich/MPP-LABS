/**
 * 
 */
package package3.composition;

/**
 * @author 610488
 *
 */
public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.sqrt(radius);
	}
}
