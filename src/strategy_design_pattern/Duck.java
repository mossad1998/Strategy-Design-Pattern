package strategy_design_pattern;

public abstract class Duck {

	public FlyBehavior flybehavior;
	public QuackBehavior quackbehavior;
	protected int age;
	
	public void performQuackBehavior(){
		quackbehavior.quack();
	}
	
	public void performFlyBehavior() {
		flybehavior.fly();
	}
	
	public void swim() {
		
		System.out.println("Swimming Swimming Tich");
	}
	
	abstract public void display();
}
