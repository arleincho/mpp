package lesson7.labs.prob3;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setBehavior(new FlyWithWings(), new Quack());
	}

}
