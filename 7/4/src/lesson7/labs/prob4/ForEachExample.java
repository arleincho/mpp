package lesson7.labs.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ForEachExample li = new ForEachExample();
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		li.process(list);
		
		//print each element of the list in upper case format
		
	}
	
	public void process(List<String> list) {
		MyConsumerList c = new MyConsumerList();
		list.forEach(c);
	}
	
	class MyConsumerList implements Consumer<String> {

		public void accept(String t) {
			System.out.println(t.toUpperCase());
		}
	}
	
	
}