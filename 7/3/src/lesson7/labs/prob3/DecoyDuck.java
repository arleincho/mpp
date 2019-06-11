package lesson7.labs.prob3;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		setBehavior(new CannotFly(), new MuteQuack());
	}

}
