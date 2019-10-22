package lesson9.labs;

import java.util.stream.IntStream;

public class Problem4 {

	public static void main(String[] args) {
	printSquares(4);


	
	}
	public static void printSquares(int num) {
		IntStream squares = IntStream.iterate(1, n -> n+1)
				.map(n -> n*n)
				.limit(num);
				squares.forEach(System.out::println);
		
	}
}
