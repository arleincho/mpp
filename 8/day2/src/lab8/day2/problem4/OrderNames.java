package lab8.day2.problem4;

import java.util.Arrays;
import java.util.stream.Stream;

public class OrderNames {
	
	public static void main(String[] args) {
		
		String[] names= {"Alexis", "Tim", "Kyleen", "KRISTY"};
		
		Arrays.sort(names, String::compareToIgnoreCase);
		
		Stream  stream =Arrays.stream(names); 
		
		stream.forEach(System.out::println);
	}
	
	
}
