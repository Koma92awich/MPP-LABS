package problem1;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {new MallardDuck(),new DecoyDuck(),new RedHeadDuck(),new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
			

	}

}
