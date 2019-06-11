package lesson7.labs.prob3;

public abstract class DuckAbstractFly implements Behavior{
	
	
	public String fly;
	
	public void fly() {
		Behavior.super.quack(this.fly);
	}
	
	public String getMessage() {
		return this.fly;
	}
}
