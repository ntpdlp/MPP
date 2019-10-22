package lab9.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static Set<String> union(List<Set<String>> sets){
		Set<String> union = sets.stream()
				.reduce((a,b) -> {a.addAll(b); return a;})
				.get();
		return union;		
	}//end_func
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Set<String> l1 = new TreeSet<String>(Arrays.asList("A","B"));
		Set<String> l2 = new TreeSet<String>(Arrays.asList("D"));
		Set<String> l3 = new TreeSet<String>(Arrays.asList("1","3","5"));
		
		
		List<Set<String>> list = Arrays.asList(l1,l2,l3);
		Set<String> out = union(list);
		System.out.println(out);
		

	}//end_main

}//end_class
