package lesson9.labs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		ConstructorReference cc = new ConstructorReference();
		// Query 1 : Print only Female canditates names
		cc.femaleCandidateNames(list);

		// Query 2 : Create an object by choosing suitable Interface to the specified
		// constructors(Totally 3 constuctors)using fourth type of Method Reference
		// ClassName::new. Then print the object status

		Function<String, Human> first = Human::new;
		BiFunction<String, Integer, Human> second = Human::new;
		TriFunction<String, Integer, String, Human> third = Human::new;
		
		List<Human> humanlist = Arrays.asList(first.apply("Godfrey"), second.apply("Komakech", 20),third.apply("Awich", 25, "Male"));
		humanlist.forEach(System.out::println);
		

		// Query 3 : Count the male candidates whose age is more than 30
		Long val = cc.countMaleWithAgeGreaterThan30(list);
		System.out.println("The count of male candidates whose age is more than 30 is  " + val);

	}

	public Long countMaleWithAgeGreaterThan30(Human[] a) {
		return Arrays.stream(a).filter(x -> x.getGender().equalsIgnoreCase("Male")).map(Human::getAge)
				.filter(y -> y > 30).count();
	}

	public void femaleCandidateNames(Human[] b) {
		Arrays.stream(b).filter(x -> x.getGender().equalsIgnoreCase("female")).map(Human::getName)
				.forEach(System.out::println);
	}
}
