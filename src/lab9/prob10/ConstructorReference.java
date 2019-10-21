package lab9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;


class Human
{
	//instance fields
	String name;
	int age;
	String gender;
	
	//constructors
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}//end_classHuman


@FunctionalInterface
interface TriFunction<U,V,T,R>{
	R apply(U u,V v,T t);
}//end_FI


public class ConstructorReference {

	private static Stream<Human> createReuseStream(Human[] list){
		Stream<Human> stream = Arrays.stream(list);
		return stream;
	}//end_func

	public static void main(String args[]){
		Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};

		// Query 1  : Print only Female canditates names
		System.out.print("Female names: ");
		ConstructorReference cr1 = new ConstructorReference();
		Stream<Human> s1 = cr1.createReuseStream(list);
		s1.filter(e -> e.getGender().equals("Female"))
			.map(Human::getName)
			.forEach(System.out::println);

		// Query 2 : Create an objecy by choosing suitable Interface to the specified constructors
		// (Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status
		Function<String, Human> f1 = Human::new;
		Human h1 = f1.apply("Renka");
		System.out.println(h1.toString());
		
		BiFunction<String, Integer, Human> f2 = Human::new;
		Human h2 = f2.apply("Maia", 25);
		System.out.println(h2.toString());
		
		TriFunction<String, Integer , String , Human> f3 = Human::new;
		Human h3 = f3.apply("Henry", 38, "Male");
		System.out.println(h3.toString());
		 

		// Query 3 : Count the male candidates whose age is more than 30
		System.out.print("Count male whose age more than 30 : ");
		ConstructorReference cr2 = new ConstructorReference();
		Stream<Human> s2 = cr2.createReuseStream(list);
		long out2 = s2.filter(e->e.getGender().equals("Male"))
				.filter(y -> y.getAge()>=30)
				.count();

		System.out.print(out2);

	}//end_main



}//end_class
