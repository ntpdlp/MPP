package lab9.prob7bb;

import java.util.*;
import java.util.stream.Collectors;

import lab9.prob7a.Employee;


public class Main {

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
		
		//LibraryLib
		String out = LambdaLibrary.F_NAME.apply(list, 100000, 'M');
		System.out.println("Solution: " + out);
		
		
	}//end_main

}//end_class
