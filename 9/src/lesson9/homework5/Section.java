package lesson9.homework5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	
	
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream
				.map((x) -> x.substring(m, n));
	}

	public static void main(String[] args) {
		streamSection(nextStream(), 2, 4)
			.forEach(System.out::println);
		
		streamSection(nextStream(), 3, 6)
			.forEach(System.out::println);
		
		streamSection(nextStream(), 1, 3)
			.forEach(System.out::println);

	}
	
	
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa123", "123bbb", "c1c2c3", "1d2d3d", "eee111", "222fff", "g3g3g3", "2h3h1h", "3i2i1i").stream();
	} 

}
//
//
//
//publicclass Section {publicstatic Stream<String> streamSection(Stream<String> stream, int m, int n) {
//	
//	
//	// Implement the code} publicstaticvoid main(String[] args) {          // Make three calls for the streamSection() method with different inputs // use nextStream() method to supply the Stream input as a first argument in streamSection() method            } //support method for the main method -- for testingprivatestatic Stream<String> nextStream() {return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();} }
//}