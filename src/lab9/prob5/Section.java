package lab9.prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n){
		//print to check cases
		System.out.print(String.format("Sublist from %d to %d: ",m,n));
		
		List<String> list = stream.collect(Collectors.toList());
		if(m>=list.size() || n>=list.size()) {
			System.out.print("Out of the list range, please select another range");
			throw new IndexOutOfBoundsException("Out of list size");
		}
		List<String> sublist = new ArrayList<>();
		for(int i = m; i<=n; i++) {
			String temp = list.get(i);
			sublist.add(temp);
		}
		sublist.forEach(e -> System.out.print(e + " "));
		System.out.println();
		return sublist.stream();
	}//end_func

	private static Stream<String> nextStream(){
		List<String> list = Arrays.asList("aaa","bbb","ccc","ddd","eee","fff","ggg","hhh","iii");
		Stream<String> out = list.stream();
		return out;
	}

	public static void main(String[] args) {
		//test1
		Stream<String> l1 = nextStream();
		Stream<String> sl1 = streamSection(l1, 1, 3);

		//test2
		Stream<String> l2 = nextStream();
		Stream<String> sl2= streamSection(l2, 2, 8);
		
		//test3
		Stream<String> l3 = nextStream();
		Stream<String> sl3= streamSection(l3, 40, 80);

	}//end_main

}//end_class
