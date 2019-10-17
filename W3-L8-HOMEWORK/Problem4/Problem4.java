package lesson8Labs;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		
	

		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Arrays.sort(names, String::compareToIgnoreCase);
	
		System.out.println(Arrays.toString(names));
		

	}

}
