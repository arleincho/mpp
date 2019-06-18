package lesson9.homework3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> words = Arrays.asList("asdfasdf", "qrwer", "fsrqr", "534arsdaf", "uutg", "trew");
		char c = 't';
		char d = 'y';
		int count = countWords(words, c, d, 4);
		System.out.println("the count of words that meet the criteria is: " + count);
	}
	
	public static int countWords(List<String> words, char c, char d, int len) {
		
		long count = words
			.stream()
			.filter(x -> x.length() == len)
			.filter(x -> x.contains(String.valueOf(c)))
			.filter(x -> !x.contains(String.valueOf(d)))
			.count();
		return (int)count;
		
	}

}
