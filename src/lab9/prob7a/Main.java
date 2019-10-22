package lab9.prob7a;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	static Comparator<Employee> empcomp = Comparator.comparing(Employee::getFirstName)
			.thenComparing(Employee::getLastName)
			.thenComparing(Employee::getSalary);
	
	
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here : sol1
		String out = list.stream()
			.filter(e -> e.getSalary()>=100000 && e.getLastName().charAt(0)>'M')
			.map(Employee::getFullName)
			.sorted()  //natural sort
			.collect(Collectors.joining(", "));
		System.out.println("Solution 1: " + out);	
		
		//your stream pipeline here : sol2
		String out2 = list.stream()
			.filter(e -> e.getSalary()>=100000 && e.getLastName().charAt(0)>'M')
			.sorted(empcomp)  //your sort style
			.map(Employee::getFullName)
			.collect(Collectors.joining(", "));
		System.out.println("Solution 2: " + out2);	

		
	}//end_main

}//end_class
