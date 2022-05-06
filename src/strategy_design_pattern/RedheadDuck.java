package strategy_design_pattern;

public class RedheadDuck extends Duck{

	RedheadDuck(){
		
		super.flybehavior = new FlyAbility();
		super.quackbehavior = new Quack();
	}
	
	@Override
	public void display() {
		
		System.out.println("I am Redhead Duck !!!!!");
	}
	public void setFlyAbility() {
		
	}

}
