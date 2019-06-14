package lab8.day2.problem3;

import java.util.List;
import java.util.Arrays;

public class OrderFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits= Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		fruits.stream()
			.forEach((x)-> System.out.println(x));
		
		
		fruits.stream()
			.forEach(System.out::println);
	
	}

}
