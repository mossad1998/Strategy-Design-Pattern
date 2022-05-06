package duck_problem;


abstract public class Duck {

	public void quack(){
		
		System.out.println("Quack Quack ");
	}
	
	public void swim() {
		
		System.out.println("Swimming Swimming Tich");
	}
	
	public void fly() {
		
		System.out.println("Flying Flying Wich");
	}
	
	abstract public void display();
	
}
