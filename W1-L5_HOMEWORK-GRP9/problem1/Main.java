package problem1;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {new MallardDuck(),new DecoyDuck(),new RedHeadDuck(),new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.swim();
		}
		
		//Output
//		   MallardDuck:
//			 display
//			 fly with wings
//			 quacking
//			 swimming
//			DecoyDuck:
//			 displaying
//			 cannot Fly
//			 cannot quack
//			 swimming
//			RedHeadDuck:
//			 displaying
//			 fly with wings
//			 quacking
//			 swimming
//			RubberDuck:
//			 displaying
//			 cannot Fly
//			 squeaking
//			 swimming
			

	}

}
