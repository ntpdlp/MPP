package lab9.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	
	public int countWords(List<String> words, char c , char d , int len) {
		long out = words.stream()
				.filter(e -> e.length()==len)
				.filter(e -> e.contains(c + ""))
				.filter(e -> ! e.contains(d + ""))
				.count();
		return (int)out;
	}//end_func
	
	public int countWords2(List<String> words, char c , char d , int len) {
		long out = words.stream()
				.filter(e -> e.length()==len && e.contains(c + "") && ! e.contains(d + ""))
				.count();
		return (int)out;
	}//end_func



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Hello","Java","JavaFX","Advanced","Jene");
		Main m = new Main();
		System.out.println("Count words: " + m.countWords(list, 'J', 'z', 4)); 
		
	}//end_main

}//end_class
