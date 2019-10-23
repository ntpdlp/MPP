package lab10.prob1;
import java.util.*;

public class GroupUtil {
	//Fix this code
	public static Group<? extends Object> copy(Group<? extends Object> group) {
		return copyHelper(group);
	}
	
	//helper
	public static <T> Group<T> copyHelper(Group<T> group){
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(),elements);
		return grp;
	}//end_func
	
	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(1, list);
		System.out.println(GroupUtil.copy(group));
		
		List<Integer> list2 = Arrays.asList(4,8,5,6);
		Group<Integer> group2 = new Group<>(8, list2);
		System.out.println(GroupUtil.copy(group2));

		List<String> list3 = Arrays.asList("C++", "C#", "Java", "Kotlin");
		Group<String> group3 = new Group<>("Java", list3);
		System.out.println(GroupUtil.copy(group3));

		
	}
}
