package lesson8Labs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Power {

	public static void main(String[] args) {

		BiFunction<Double, Double, List<Double>> power = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
			
		};
		System.out.println(power.apply(2.0, 3.0));

	}

}
