package lab9.prob4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamIterate {
	
	public static void printSquares(int num) {
		IntStream ints = IntStream.iterate(1, n->n+1)
				.limit(num)
				.map(x -> x*x);
		
		Stream<Integer> str = ints.boxed();
		str.forEach(e -> System.out.print(e + " "));

			    
	}//end_func

	public static void main(String[] args) {
		printSquares(4);
	}//end_main

}//end_class
