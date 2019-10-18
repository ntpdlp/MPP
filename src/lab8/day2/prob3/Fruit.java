package lab8.day2.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Fruit {

	public static void main(String[] args) {
		// a
		List<String> fruits = Arrays.asList("Apple","Banana","Orange","Cherries","Blums");
		fruits.forEach(e->System.out.println(e));
		
		//b
		fruits.forEach(System.out::println); 
		
	}//end_main

}//end_class
