package lab7.prob3;

interface Duck {
	
	default void display() {
		System.out.println("displaying");
	}
	default void fly() {
		System.out.println("can fly");
	}
	default void quack() {
		System.out.println("quacking");
	}
	default void swim() {
		System.out.println("swimming");
	}
}
