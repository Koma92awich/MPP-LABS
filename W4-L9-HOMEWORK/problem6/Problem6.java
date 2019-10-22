package lesson9.labs;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> list = new ArrayList<>();
		Set<String> set1 = new LinkedHashSet<>(Arrays.asList("A","B"));
		Set<String> set2 = new LinkedHashSet<>(Arrays.asList("D"));
		Set<String>set3 = new LinkedHashSet<>(Arrays.asList("1","3","5"));
		list.add(set1);
		list.add(set2);
		list.add(set3);
		System.out.println(union(list));

	}
	public static Set<String> union(List<Set<String>> sets){
		
	Optional<Set<String>> un =	sets.stream().reduce((x,y) ->{
			x.addAll(y);
			return x;});
		
		return un.get();
	}


}
