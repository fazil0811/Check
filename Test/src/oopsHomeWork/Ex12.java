package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex12 {
	public static void main(String[] args) {
		
		String a="udhaya";
		
		List<String> words=Arrays.asList(a.split(""));
		
		List<String>letters=words.stream().map(x->x).skip(1).collect(Collectors.toList());
		
		letters.forEach(x->System.out.println(x));
	}

}
