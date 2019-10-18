package lab8.day2.prob1;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Employee {
	//instance fields
	private String name;
	private int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,salary);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Employee)) return false;
		Employee aEmp = (Employee) obj;
		return (this.name.equalsIgnoreCase(aEmp.getName()) && this.salary == aEmp.getSalary());
	}
	
	public boolean myMethod(Employee x) {
		Predicate<Employee> f = this::equals;
		return f.test(x);
		
	}
	
	public static void main(String[] args) {
		// data
		Employee emp1 = new Employee("Joe",1000);
		Employee emp2 = new Employee("Joe",1000);
		Employee emp3 = new Employee("Andy",5000);
		
		boolean b1 = emp1.myMethod(emp2);
		boolean b2 = emp1.myMethod(emp3);
		System.out.printf("%s , %s",b1,b2);
		

		
	}//end_main

}
