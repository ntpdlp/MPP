package lab10.prob2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondMax {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(4);
		ints.add(8);
		ints.add(20); // 3 4 8 20

		List<String> strs = new ArrayList<>();
		strs.add("Bob");
		strs.add("Susan");
		strs.add("Alice");
		strs.add("Zera"); // Alice Bob Susan Zera
		
		
		List<Float> floats = new ArrayList<>();
		floats.add(2.3f);
		floats.add(4.5f);
		floats.add(10.0f);
		floats.add(5.0f); //2.3 4.5 5.0 10.0

		System.out.println(maxSecond(ints, new AnyComparator<Integer>()));
		System.out.println(maxSecond(strs, new AnyComparator<String>()));
		System.out.println(maxSecond(floats, new AnyComparator<Float>()));
		
	}// end_main

	public static <T> T maxSecond(List<? extends T> list, Comparator<T> cmp) {
		list.sort(cmp);
		return list.get(list.size() - 2);
	}

	
	static class AnyComparator<T extends Comparable<T>> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
	}// endcomparator


}//end_class