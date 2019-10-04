/**
 * 
 */
package package3.inheritance;

/**
 * @author 610488
 *
 */
public class Circle extends Cylinder{
	private double radius;
	
	public Circle(double radius,double height) {
		super(radius,height);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.sqrt(radius);
	}
}
