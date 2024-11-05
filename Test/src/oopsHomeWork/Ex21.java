package oopsHomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex21 {
	public static void main(String[] args) {
		
		List<String>words=Arrays.asList("aaa","xxx","abd","heg","ikl");
		
		List<String>final1=words.stream().sorted().map(x->x.toUpperCase()).collect(Collectors.toList());
		
		final1.forEach(x->System.out.println(x));
		
	}

}
