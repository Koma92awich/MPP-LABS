package lab5.problem2;
/**
 * Group 9
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Figure> figures = new ArrayList<Figure>(Arrays.asList(new Rectangle(2,5),new Triangle(3,7), new Circle(6)));
		
		double sum = 0.0;
		for(Figure temp: figures) {
			sum+=temp.computeArea();
		}
		System.out.println("Sum of Areas = "+sum);

	}

}
