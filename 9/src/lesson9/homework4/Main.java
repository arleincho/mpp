package lesson9.homework4;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
	}
	
	
	public static void printSquares(int num) {
		String squares  = Stream.
			iterate(1, n -> n + 1)
			.limit(num)
			.map(x -> x * x)
			.map(String::valueOf)
			.collect(Collectors.joining(","));
		System.out.println(squares);
	}

}
