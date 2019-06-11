package lesson7.labs.prob3;

public abstract class DuckAbstractQuack implements Behavior{
	
	
	public String quack;
	
	public void quack() {
		Behavior.super.quack(this.quack);
	}
	
	public String getMessage() {
		return this.quack;
	}
}
