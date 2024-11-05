package oopsHomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex14 {
	public static void main(String[] args) {
		
		String a="nishanthi";
		List<String>words=Arrays.asList(a.split(""));
		List<String>letters=words.stream().filter(x->Collections.frequency(words, x)==1).collect(Collectors.toList());
		letters.forEach(x->System.out.println(x));
	}
}