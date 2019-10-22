package lesson9.labs;


import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Problem2 {

	public static void main(String[] args) {
		
		
		IntSummaryStatistics myIntStream = IntStream.of(10,43,24,26,64,12,3,52)
				.summaryStatistics();
		System.out.println("Maximum is "+ myIntStream.getMax() +" " + "Minimum is " + myIntStream.getMin());

	}

}
