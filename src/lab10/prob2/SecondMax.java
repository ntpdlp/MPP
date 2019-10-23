package lab10.prob2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondMax {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);ints.add(4);ints.add(8);ints.add(20); //3 4 8 20

		
		List<String> strs = new ArrayList<>();
		strs.add("Bb"); strs.add("Ss"); strs.add("Aa"); strs.add("Zz"); // Aa Bb Ss Zz 
		
		System.out.println(maxSecond(ints,new IntegerComparator()));
		System.out.println(maxSecond(strs,new StringComparator()));

	}//end_main
	
	
	public static <T> T maxSecond(List<? extends T> list, Comparator<? super T> cmp) {
		list.sort(cmp);
		return list.get(list.size()-2);
	}

	
	static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
			
		}
		
	}//endcomparator
	
	static class StringComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
			
		}
		
	}

	
	
}//end_class
