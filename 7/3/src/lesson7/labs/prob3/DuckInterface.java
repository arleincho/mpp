package lesson7.labs.prob3;

public interface DuckInterface {
	
	public default void display() {
		System.out.println("displaying");
	};
	
	public default void swim() {
		System.out.println("swimming");
	}
}
