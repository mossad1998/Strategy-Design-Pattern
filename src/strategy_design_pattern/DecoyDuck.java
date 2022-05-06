package strategy_design_pattern;

public class DecoyDuck extends Duck{

	DecoyDuck(){
		super.flybehavior = new NoFlyAbility();
		super.quackbehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		
		System.out.println("I am Decoy Duck !!!!!");
	}

}
