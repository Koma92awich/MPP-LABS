package lesson9.labs;

import java.util.*;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

	// Is there any Vegetarian meal available ( return type boolean)
	public static Boolean isVegetarianMealAvailable() {
		return menu.stream().anyMatch(x -> x.vegetarian);
	}

	// Is there any healthy menu have calories less than 1000 ( return type boolean)

	public static Boolean anyHealthyMenulessthan100() {
		return menu.stream().anyMatch(y -> y.calories < 1000);
	}
	// Is there any unhealthy menu have calories greater than 1000 ( return type
	// boolean)

	public static Boolean anyUnhealthyMenuGreaterthan100() {
		return menu.stream().anyMatch(z -> z.calories > 1000);
	}

	// find and return the first item for the type of MEAT( return type
	// Optional<Dish>)

	public static Optional<Dish> firstIteamMeat() {
		return menu.stream().filter(m -> m.type == Type.MEAT).findFirst();

	}

	// calculateTotalCalories() in the menu using reduce. (return int)
	public static int totalCalories() {
		return menu.stream().map(d -> d.calories) // Dish::getCalories
				.reduce(0, (m, n) -> m + n);
	}
	// calculateTotalCaloriesMethodReference() in the menu using MethodReferences

	public static int TotalCaloriesMethodReference() {
		return menu.stream().map(s -> s.calories).reduce(0, Integer::sum);
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// a
		System.out.println("Is there any Vegetarian meal available: " + Dish.isVegetarianMealAvailable());

		// b
		System.out
				.println("Is there any healthy menu have calories less than 1000: " + Dish.anyHealthyMenulessthan100());

		// c
		System.out.println("Is there any unhealthy menu have calories greater than 1000:  "
				+ Dish.anyUnhealthyMenuGreaterthan100());

		// d
		//System.out.println("find and return the first item for the type of MEAT: "
				//+ Dish.firstIteamMeat().ofNullable("No Meat Available").get());
		System.out.println(firstIteamMeat());

		// e
		System.out.println("calculateTotalCalories() in the menu using reduce: " + Dish.totalCalories());

		// f
		System.out.println("calculateTotalCaloriesMethodReference()in the menu using MethodReferences.: "
				+ Dish.TotalCaloriesMethodReference());
	}
}
