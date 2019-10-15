package lab7.prob2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();
	public static void main(String[] args) {
		List<ClosedCurve> cc = new ArrayList<>();
		cc.add(new Rectangle(5,7));
		cc.add(new Circle(6));
		cc.add(new Ellipse(4.5,9));
		cc.add(new EquilateralTriangle(5));
		System.out.println("Output: " + computeAveragePerimeter(cc));
		
 	}
	
	//OO (good) way of performing computation
	public static double computeAveragePerimeter(List<ClosedCurve> l) {
		double sum = 0.0;
		for(int i = 0; i < l.size(); ++i) {
			sum += l.get(i).computePerimeter();
		}
		return sum/l.size();
	}

}
