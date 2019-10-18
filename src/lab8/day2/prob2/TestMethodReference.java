package lab8.day2.prob2;

import java.util.Random;
import java.util.function.Supplier;

public class TestMethodReference {
	
	class InnerSupplier implements Supplier<Double>{

		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return Math.random();
		}
		
	}//end_innerclass
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i
		Supplier<Double> f1 = Math::random;
		System.out.println(f1.get());
		
		//ii
		Supplier<Double> f2 = () -> Math.random();
		System.out.println(f2.get());
		
		//iii
		InnerSupplier f3 = new TestMethodReference().new InnerSupplier();
		System.out.println(f3.get());
		
		
		
	}//end_main

}//end_class
