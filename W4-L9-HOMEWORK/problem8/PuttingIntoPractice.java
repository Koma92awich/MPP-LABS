package lesson9.labs;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		List<Transaction>trn = transactions.parallelStream()
		.filter(x -> x.getYear() ==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.collect(Collectors.toList());
		
		System.out.println(trn);


        
        // Query 2: What are all the unique cities where the traders work?
		String city = transactions.parallelStream()
		.map(x -> x.getTrader().getCity())
		.distinct()
		.collect(Collectors.joining(","));
		
		System.out.println(city);
	
        

        // Query 3: Find all traders from Cambridge and sort them by name.
		List<Trader> cambr= transactions.stream()
		.filter(y ->y.getTrader().getCity().equalsIgnoreCase("Cambridge"))
		.map(Transaction::getTrader)
		.distinct()
		.sorted(Comparator.comparing(Trader::getName))
		.collect(Collectors.toList());
		
		System.out.println(cambr);
		
		
        
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
		String traders =  transactions.parallelStream()
				.map(h -> h.getTrader().getName())
				.distinct()
				.sorted()
				.collect(Collectors.joining(","));
		
		System.out.println(traders);
        

        // Query 5: Are there any trader based in Milan?
		boolean palce =  transactions.parallelStream()
				.anyMatch(x ->x.getTrader().getCity().equalsIgnoreCase("Milan"));
				
		System.out.println(palce);
        
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        
        transactions.parallelStream()
        		.filter(x -> x.getTrader().getCity().equalsIgnoreCase("Milan"))
        		.map(Transaction::getTrader)
        		.forEach(k ->k.setCity("Cambridge"));
        		
        // Query 7: What's the highest value in all the transactions?
        int maximum = transactions.stream()
        		.map(Transaction::getValue)
        		.reduce(0, Integer::max);
        
        System.out.println("Highest value is :"+ maximum);
    }
}
