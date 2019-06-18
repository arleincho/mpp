package lesson9.homework2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> myIntStream = Stream.of(123, 34, 65, 778, 23, 656, 4684, 5634,223, 45, 1, -345);
		
		IntSummaryStatistics myIntStreamSummary = myIntStream
				.collect(Collectors.summarizingInt(Integer::intValue));
		
		int max = myIntStreamSummary.getMax();
		int min = myIntStreamSummary.getMin();
		
		System.out.println("The max value is: " + max + " and the min value is:" + min);
		
		

	}

}
