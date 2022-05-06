package duck_problem;

public class main {

	public static void main(String[] args) {
		// any duck can quack and swim
		// only Mallar and Redhead ducks can fly

		//Adding fly method to the super class will give this ability to all the child classes
		//we can override the fly function and leave it empty with any duck that can't fly
		//having multiple abilities there will be a lot of empty redundant methods
		//we can abstract any unique ability and implement this ability for the correct type.
		//changing anything in the fly ability will lead to change the whole fly methods in each type.
		
		
		Duck d1 = new MallardDuck();
		Duck d2 = new RedheadDuck();
		Duck d3 = new RubberDuck();
		
		d1.quack();
		d1.swim();
		d1.fly();
		d1.display();
		
		d2.quack();
		d2.swim();
		d2.fly();
		d2.display();
		
		d3.quack();
		d3.swim();
		d3.fly();
		d3.display();
	}

}
