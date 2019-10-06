package lab5.problem2;
/**
 * 
 * @author Group 9
 *
 */

public final class Triangle implements Figure {
	private final double height;
	private final double base;
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public double getBase() {
		return base;
	}
	@Override
	public double computeArea() {
		return  (base * height)/2 ;
	}
	

}
