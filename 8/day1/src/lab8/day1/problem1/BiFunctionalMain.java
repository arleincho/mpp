package lab8.day1.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionalMain {

	public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> list = (x, y) -> {
        	List<Double> tmp = new ArrayList<Double>();
        	tmp.add(Math.pow(x,y));
        	tmp.add(x * y);
			return tmp;
        };
        List<Double> lista = list.apply(2.0, 3.0);
        
        System.out.println("El resutlado es:" + lista);

	}

}
