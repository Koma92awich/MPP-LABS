package problem1;


public class Person {

	private String name;

	Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (!(aPerson instanceof Person)) {
			return false;
		}
		Person p = (Person) aPerson;
		return p.getName().equals(name);
	}

	public static void main(String[] args) {

	}

}
