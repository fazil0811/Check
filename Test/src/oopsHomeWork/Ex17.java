package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Integer[] a= {2,2,4,4,6,6,2,7,1,3,9};
		
		List<Integer>num=Arrays.asList(a);
		
		List<Integer>nums=num.stream().map(x->x).distinct().collect(Collectors.toList());
		
		System.out.println(nums);
		
	}

}
