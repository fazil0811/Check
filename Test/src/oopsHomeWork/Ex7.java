package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
	public static void main(String[] args) {
		
		List<Integer>li=Arrays.asList(10,20,30,07,9);
		List<Integer>even=li.stream().filter(x->x%2==0).map(x->x).collect(Collectors.toList());
		even.forEach(t->System.out.println(t));
		
	}

}
