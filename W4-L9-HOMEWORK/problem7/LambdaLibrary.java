package lesson9.labs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final Function<List<Employee>, String> SORTEDNAMES = list -> list.stream()
			.filter(x -> x.getSalary() > 100000 && x.getLastName().charAt(0) > 'M')
			.map(e -> e.firstName + " " + e.lastName).sorted(Comparator.comparing(s -> s))
			.collect(Collectors.joining(","));

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		String xx = LambdaLibrary.SORTEDNAMES.apply(list);
		System.out.println(xx);
	}

}
