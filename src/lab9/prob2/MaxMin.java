package lab9.prob2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {

	public static void main(String[] args) {
		List<Integer> myIntStream = Arrays.asList(6,2,90,4,300);
		
		IntSummaryStatistics iss = myIntStream.stream()
				.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Min: " + iss.getMin());
		System.out.println("Max: " + iss.getMax());
	}

}
