package lab9.prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class printStream {

	public static void main(String[] args) {
		String out = Stream.of("Bill","Thomas","Mary")
				.collect(Collectors.joining(", "));
		
		System.out.println(out);

	}

}
