package lesson7.labs.prob3;

public class RubberDuck extends Duck {

	public RubberDuck() {
		setBehavior(new CannotFly(), new Squeak());
	}

}
