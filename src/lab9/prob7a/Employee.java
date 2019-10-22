package lab9.prob7a;

import java.util.Objects;

public class Employee {
	//instance fields
	String firstName, lastName;
	int salary;
	
	//constructor
	public Employee(String f, String l, int s) {
		this.firstName = f;
		this.lastName = l;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("first name: ");
		sb.append(firstName);
		sb.append(" last name: ");
		sb.append(lastName);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(firstName,lastName,salary);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return other.getFirstName().equals(firstName) && other.getLastName().equals(lastName) && other.getSalary()==salary;
	}
	
	 
	
}

