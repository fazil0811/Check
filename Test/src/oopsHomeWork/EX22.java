package oopsHomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EX22 {
	
	public static void main(String[] args) {
		
		Integer[] a= {1,5,6,8,9,5};
		Integer[] b= {6,9,3,4};
		
		List<Integer>num=Arrays.asList(a);
		List<Integer>num1=Arrays.asList(b);
		
		List<Integer>nums=num.stream().filter(x->Collections.frequency(num1, x)>=1).collect(Collectors.toList());
		nums.forEach(x->System.out.println(x));
		
	}

}
