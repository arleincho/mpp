package lesson7.labs.prob3;

public abstract class Duck implements DuckInterface{
	
	private Behavior flyBehaior;
	private Behavior quackBehavior;

	void setBehavior(Behavior flyBehaior, Behavior quackBehavior) {
		this.flyBehaior = flyBehaior;
		this.quackBehavior = quackBehavior;
	}

	public void quack() {
		quackBehavior.quack(quackBehavior.getMessage());
	}

	public void fly() {
		flyBehaior.fly(flyBehaior.getMessage());
	}
}
