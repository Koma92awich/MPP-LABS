package lab5.problem2;
/**
 * 
 * @author Group 9
 *
 */

public final class Rectangle implements Figure {
	private final double width;
	private final double length;
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	@Override
	public double computeArea() {
		return  width * length;
	}
	
	

}
