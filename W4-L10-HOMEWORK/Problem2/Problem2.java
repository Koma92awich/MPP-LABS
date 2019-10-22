package lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
	
	public static void main (String[] arg) {
		List<Integer> numbers = Arrays.asList(13,3,24,24,5,1,3,4);
		System.out.println(secondSmallest(numbers));
		
	}
	
	public static <T> T secondSmallest(List<T> list){
		List<T> val = list.stream()
				.sorted()
				.collect(Collectors.toList());
		
		return val.get(1);
		
	}

}
