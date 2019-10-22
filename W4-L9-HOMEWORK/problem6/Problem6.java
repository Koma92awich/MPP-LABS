package lesson9.labs;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Set<String> union(List<Set<String>> sets){
		
	Optional<Set<String>> un =	sets.stream().reduce((x,y) ->{
			x.addAll(y);
			return x;});
		
		return un.get();
	}


}
