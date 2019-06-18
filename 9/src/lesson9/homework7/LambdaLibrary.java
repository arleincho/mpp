package lesson9.homework7;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
	/**
	  * Accepts list of customers and a search string <code>searchStr</code>.
	  * 
	  * Returns the names of those customers whose name begins with <code>searchStr</code>,
	  * in sorted order.
	  */
	 public static final Function<List<Employee>, String> NAMES_SALARY 
	  		= (list) 
	  		     -> list.stream()
				        .filter(p -> {
				        		return p.getLastName().charAt(0) >= 78 &&
				        				p.getLastName().charAt(0) <= 90 &&
				        				p.getSalary() > 100000; 
				        		
				        })
                        .map(p -> p.getFirstName().concat(" " + p.getLastName()))
                        .sorted()
                        .collect(Collectors.joining(","));

}
