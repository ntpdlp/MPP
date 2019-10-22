package lab9.prob7bb;

import java.util.List;
import java.util.stream.Collectors;

import lab9.prob7a.Employee;

public class LambdaLibrary{

	
	// TriFunction <S,U,V,R> f = () -> ();
	public static final TriFunction<List<Employee>, Integer, Character, String> F_NAME
			= (s,v,u) -> s.stream()
						.filter((Employee e) -> e.getSalary()>=v && e.getLastName().charAt(0)>u)
						.map(Employee::getFullName)
						.sorted()  //natural sort
						.collect(Collectors.joining(", "));

}//end_class
