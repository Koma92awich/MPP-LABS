package assignment3.problem1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	
	public PersonWithJob(String name) {
		person = new Person(name);
	}
	
	PersonWithJob(String n, double s) {
		salary = s;
		person = new Person(n);
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
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe");
		//Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p2.equals(p1));
		System.out.println("p2.equals(p1)? " + p2.equals(p2));
	}


}
