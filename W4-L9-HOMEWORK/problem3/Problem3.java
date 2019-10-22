package lesson9.labs;

import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		
		
		Problem3 p = new Problem3();
	//	p.countWords(words, c, d, len)


	}
		
	public  int countWords(List<String> words, char c, char d, int len) {	
		return (int) words.stream()
		.filter(x -> x.length() == len)
		.filter(y -> y.contains(""+c) && !y.contains(""+d))
		.count();
	}
	
}
