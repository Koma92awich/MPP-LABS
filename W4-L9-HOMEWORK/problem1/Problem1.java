package lesson9.labs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {

	public static void main(String[] args) {
		
		System.out.println(Stream.of("Bill","Thomas","Mary")
				.collect(Collectors.joining(",")));

	}

}
