package lab7.prob2;

public class Ellipse implements ClosedCurve{
	//instance fields
	private double a;
	private double E;
	
	//constructor
	Ellipse(double a, double E){
		this.a=a;
		this.E=E;
	}
	
	//getter
	public double getA() {
		return a;
	}
	public double getE() {
		return E;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4*a*E;
	}
}
