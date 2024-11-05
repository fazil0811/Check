package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WEx18 {
	public static void main(String[] args) {
		List<String>word=Arrays.asList("fazil","udhaya","santhanam");
		List<Integer>nums=word.stream().map(x->x.length()).collect(Collectors.toList());
		nums.forEach(z->System.out.println(z));
	}

}
