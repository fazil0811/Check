package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex5 {
		public static void main(String[] args) {
			List<String>words=Arrays.asList("udhaya");
			Map<String, Long>letters=words.stream().map(o->o.split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			letters.forEach((t,w)->System.out.println(t+"= "+w));
		}
	
	}
