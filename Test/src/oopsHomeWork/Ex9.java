package oopsHomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex9 {
	public static void main(String[] args) {
		String a="camgeminii";
		List<String>words=Arrays.asList(a.split(""));
		Map<String,Long>letters=words.stream().filter(x->Collections.frequency(words, x)>=1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Long nos=words.stream().count();
		letters.forEach((t,w)->System.out.println(t+"="+w));
		System.out.println(nos);
	}

}
