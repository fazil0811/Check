package oopsHomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex6 {
	public static void main(String[] args) {
		String a="santhanam";
		List<String>words=Arrays.asList(a.split(""));
		
		
		String fir=words.stream().filter(x->Collections.frequency(words, x)==1).findFirst().get();
		System.out.println(fir);
		
	
		Map<String,Long>letters=words.stream().map(x->x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		letters.forEach((t,w)->System.out.println(t+"="+w));
		
	}

}
