package lab3.prob1;

public class PersonWithJob {
	//fields
	private double salary;
	private Person person;
	
	//getter
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return person.getName();
	}
	
	//constructor
	PersonWithJob(String name, double salary) {
		person = new Person(name);
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); //PersonWithJob
		System.out.println("p2.equals(p1)? " + p2.equals(p1)); //Person
	}//end_main


}//end_class
