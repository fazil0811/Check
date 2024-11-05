package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex23 {
	
	public static void main(String[] args) {
		
		String a="i am coding";
		
		List<Character>b=a.chars().mapToObj(x->(char)x).filter(x->!Character.isWhitespace(x)).collect(Collectors.toList());
		
		Long nos=b.stream().count();
		System.out.println(nos);
		
	}

}
