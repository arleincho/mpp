package lesson7.labs.prob3.extpackage;

import lesson7.labs.prob3.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };
		for (Duck d : ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			System.out.print("	");
			d.display();
			System.out.print("	");
			d.fly();
			System.out.print("	");
			d.quack();
			System.out.print("	");
			d.swim();
		}
	}

}
