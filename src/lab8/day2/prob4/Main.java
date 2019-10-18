package lab8.day2.prob4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	//inner class
	class NameComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareToIgnoreCase(o2);
		}
		
	}//end_innerclass
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Tim","Alexis","Kyleen","KRISTY"};
		NameComparator namecomp = new Main().new NameComparator();
		Arrays.sort(names, namecomp::compare);
		for(String s:names) {
			System.out.println(s);
		}
	}//end_main

}//end_class
