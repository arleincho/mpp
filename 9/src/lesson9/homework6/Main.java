package lesson9.homework6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<HashSet<String>> list = new ArrayList<HashSet<String>>();
		HashSet<String> item1 = new HashSet<String>();
		HashSet<String> item2 = new HashSet<String>();
		HashSet<String> item3 = new HashSet<String>();
		
		item1.add("A");
		item1.add("B");
		item2.add("D");
		item3.add("1");
		item3.add("3");
		item3.add("5");
		
		list.add(item1);
		list.add(item2);
		list.add(item3);
		
		
		List<String> finalList = list.stream()
			.flatMap(Collection::stream)
			.collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(finalList);

	}
	
	
	public Set<String> union(List<Set<String>> sets){
		return null;
		
	}

}
