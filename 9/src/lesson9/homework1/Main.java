package lesson9.homework1;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		
		String result = stringStream
				.map(Function.identity())
			.collect( Collectors.joining(","));
			
		System.out.println(result);
	}

}
