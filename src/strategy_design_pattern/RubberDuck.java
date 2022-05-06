package strategy_design_pattern;

public class RubberDuck extends Duck{

	RubberDuck(){
		
		super.flybehavior = new NoFlyAbility();
		super.quackbehavior = new Squeak();
	}
	@Override
	public void display() {
		
		System.out.println("I am Rubber Duck !!!!!");
	}

}
