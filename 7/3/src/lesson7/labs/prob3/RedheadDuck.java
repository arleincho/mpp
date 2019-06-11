package lesson7.labs.prob3;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		setBehavior(new FlyWithWings(), new Quack());
	}
}
