package lab9.prob8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice{
	
	private static Stream<Transaction> createReuseStream(List<Transaction> list, String title){
		System.out.println(title + " : ");
		return list.stream();
	}//end_func
	
	private static Stream<Trader> createReuseStreamTrader(List<Trader> list, String title){
		System.out.println(title + " : ");
		return list.stream();
	}//end_func

    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Trader> traders = Arrays.asList(raoul,mario,alan,brian);
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		Stream<Transaction> s1 = createReuseStream(transactions,"Query 1");
		s1.filter(e -> e.getYear()>=2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList())
				.forEach(System.out::println);

        
        // Query 2: What are all the unique cities where the traders work?
		Stream<Trader> s2 = createReuseStreamTrader(traders, "Query 2");
		s2.filter(e -> e.getCity() != null)
				.collect(Collectors.toSet())
				.forEach(System.out::println);
			
       

        // Query 3: Find all traders from Cambridge and sort them by name.
		Stream<Trader> s3 = createReuseStreamTrader(traders, "Query 3");
		s3.filter(e -> e.getCity().equals("Cambridge"))
						.sorted(Comparator.comparing(Trader::getName))
						.forEach(System.out::println);

   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
		Stream<Trader> s4 = createReuseStreamTrader(traders,"Query 4");
		String out4 = s4.sorted(Comparator.comparing(Trader::getName))
			.map(Trader::toString)
			.collect(Collectors.joining(", "));
		System.out.println(out4);				
       

        // Query 5: Are there any trader based in Milan?
		Stream<Trader> s5 = createReuseStreamTrader(traders,"Query 5");
		String out5 = s5.filter(e -> e.getCity().equals("Milan"))
			.map(Trader::toString)
			.collect(Collectors.joining(", "));
		System.out.println(out5);				
       
        
		// Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		Stream<Transaction> s6 = createReuseStream(transactions, "Query 6");  
		s6.filter(e -> e.getTrader().getCity().equals("Milan"))
			.forEach(y -> y.getTrader().setCity("Cambridge"));
		
		Stream<Trader> s66 = createReuseStreamTrader(traders, "check city be updated to Cambridge ");
		s66.forEach(System.out::println);
		
        
        // Query 7: What's the highest value in all the transactions?
		Stream<Transaction> s7 = createReuseStream(transactions, "Query 7");
		IntSummaryStatistics iss = s7.collect(Collectors.summarizingInt(Transaction::getValue));
		System.out.println("Highest value: " + iss.getMax());
    }//end_main
}//end_class
