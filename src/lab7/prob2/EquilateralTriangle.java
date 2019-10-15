package lab7.prob2;

public class EquilateralTriangle implements Polygon{
	//instance fields
	private double side;
	
	//constructor
	EquilateralTriangle(double side){
		this.side = side;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		double[] sides = {side,side,side};
		return sides;
	}
}
