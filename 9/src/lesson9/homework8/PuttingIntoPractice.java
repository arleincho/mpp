package lesson9.homework8;



import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PuttingIntoPractice{
	
	
	static List<Transaction> transactions;
	
	public static Stream<Transaction> getStream() {
		return PuttingIntoPractice.transactions.stream();
	}
	
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
        PuttingIntoPractice.transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1400),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        

        System.out.println("Query 1");
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        getStream()
        .filter(p -> p.getYear() == 2011)
        .sorted(Comparator.comparing((Transaction t1) -> t1.getValue()))
        .forEach(System.out::println);
		
        
        System.out.println("_________________________________");
        System.out.println("Query 2");
        // Query 2: What are all the unique cities where the traders work?
        getStream()
        .map(t -> t.getTrader().getCity())
        .distinct()
        .forEach(System.out::println);
        
        System.out.println("_________________________________");
        System.out.println("Query 3");
        // Query 3: Find all traders from Cambridge and sort them by name.
        getStream()
        .map(t -> t.getTrader())
        .filter(t -> t.getCity().equals("Cambridge"))
        .map(t -> t.getName())
        .distinct()
        .sorted()
        .forEach(System.out::println);
   
        
        System.out.println("_________________________________");
        System.out.println("Query 4");
        // Query 4: Return a string of all traders names sorted alphabetically.
        
        String res4 = getStream()
        .map(t -> t.getTrader())
        .map(t -> t.getName())
        .distinct()
        .sorted()
        .collect(Collectors.joining(" "));
        
        System.out.println(res4);
        
        
        System.out.println("_________________________________");
        System.out.println("Query 5");
        // Query 5: Are there any trader based in Milan?
        Trader res5 = getStream()
        		.map(t -> t.getTrader())
        		.filter(t -> t.getCity().equals("Milan"))
        		.findAny()
                .orElse(null);
        
        System.out.println(res5);
        
        
        System.out.println("_________________________________");
        System.out.println("Query 6");
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        List<Transaction> res6 = getStream()
        	.filter(t -> t.getTrader().getCity().equals("Milan"))
        	.map(t -> {
        		t.getTrader().setCity("Cambridge");
        		return t;
        	})
        	.collect(Collectors.toList());
		
        System.out.println(res6);
        	
        
        System.out.println("_________________________________");
        System.out.println("Query 7");
        // Query 7: What's the highest value in all the transactions?
        OptionalInt maxValue = getStream()
        		.mapToInt(v -> v.getValue())
        		.max();
        System.out.println("The highest value:" + maxValue);
    }
}
