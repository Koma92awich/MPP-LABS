package problem1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	
	public PersonWithJob(String name) {
		person = new Person(name);
	}
	
	
	public Person getPerson() {
		return person;
	}
	
	
	@Override
	public boolean equals(Object aPerson) {
		if (!(aPerson instanceof Person)) {
			return false;	
		}
		PersonWithJob p = (PersonWithJob) aPerson;
		return p.person.getName().equals(person.getName());
	}
	
	
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe").getPerson();
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p1.equals(p2));
	}


}
