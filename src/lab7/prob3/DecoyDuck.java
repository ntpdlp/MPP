package lab7.prob3;

public class DecoyDuck implements Duck{	
	@Override
	public void fly() {
		System.out.println("can not fly");
	}
	@Override
	public void quack() {
		System.out.println("squeaking");
	}

}
