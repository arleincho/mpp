package lesson7.labs.prob3;

public interface Behavior{
	
	public String getMessage();
	
	public default void quack(String message) {
		System.out.println(message);
	}
	
	public default void fly(String message) {
		System.out.println(message);
	}
	
}
