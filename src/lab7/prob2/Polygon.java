package lab7.prob2;

public interface Polygon extends ClosedCurve{
	double[] getSides();
	public default double computePerimeter() {
		double[] sides = getSides();
		double sum = 0;
		for(double e:sides) {
			sum += e;
		}
		return sum;
	}
	
}
