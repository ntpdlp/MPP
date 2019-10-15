package lab7.prob3;

public class RedheadDuck implements Duck{

	@Override
	public void fly() {
		System.out.println("can not fly");
	}
	
	@Override
	public void quack() {
		System.out.println("can not quack");
	}
}
