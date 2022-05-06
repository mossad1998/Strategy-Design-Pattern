package strategy_design_pattern;

public class MallardDuck extends Duck{

	MallardDuck(){
		
		super.flybehavior = new FlyAbility();
		super.quackbehavior = new Quack();
	}
	
	@Override
	public void display() {
		
		System.out.println("I am Mallard Duck !!!!!");
	}

}
