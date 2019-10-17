package lesson8Labs;

import java.util.function.Supplier;

public class MathRandom {

	public static void main(String[] args) {

		Supplier<Double> sp = () -> Math.random();

		System.out.println(sp.get());
	}

}
