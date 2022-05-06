package strategy_design_pattern;



public class main {

	public static void main(String[] args) {

		Duck d1 = new MallardDuck();
		Duck d2 = new RedheadDuck();
		Duck d3 = new RubberDuck();
		Duck d4 = new DecoyDuck();
		
		d1.performQuackBehavior();
		d1.swim();
		d1.performFlyBehavior();
		d1.display();
		
		d2.performQuackBehavior();
		d2.swim();
		d2.performFlyBehavior();
		d2.display();
		
		d3.performQuackBehavior();
		d3.swim();
		d3.performFlyBehavior();
		d3.display();
		
		d4.performQuackBehavior();
		d4.swim();
		d4.performFlyBehavior();
		d4.display();
	}

}
