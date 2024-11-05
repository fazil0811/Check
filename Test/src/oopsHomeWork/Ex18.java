package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex18 {
	
	public static void main(String[] args) {
		
		String[] a= {"fazil","udhaya","santhanam"};
		
		List<String>word=Arrays.asList(a);
		
		List<Integer>words=word.stream().map(x->x.length()).collect(Collectors.toList());
		
		System.out.println(words);
		
		words.forEach(x->System.out.println(x));
	}

}
