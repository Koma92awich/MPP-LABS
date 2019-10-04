/**
 * 
 */
package package3.composition;

/**
 * @author Group 9
 *
 */
public class Cylinder {
	private double height;
	private Circle circle;
	private double radius;
	
	public Cylinder(double radius,double height) {
		this.radius  = radius;
		this.height  = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return Math.sqrt(Math.PI) * height;
	}
	
	

}
