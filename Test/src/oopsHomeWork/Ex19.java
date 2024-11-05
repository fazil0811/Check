package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex19 {
	
	public static void main(String[] args) {
		
		Integer[] a= {1,2,3,4,5};
		Integer[] b= {6,7,3,4,5};
		Integer[] c= {5,6,3,6,7};
		
		List<Integer>num1=Arrays.asList(a);
		List<Integer>num2=Arrays.asList(b);
		List<Integer>num3=Arrays.asList(c);
		
		List<Integer>nums=Stream.of(num1,num2,num3).flatMap(List::stream).collect(Collectors.toList());
		
		int even=nums.stream().filter(x->x%2==0).collect(Collectors.summingInt(x->x));
		
		int odd=nums.stream().filter(x->x%2!=0).collect(Collectors.summingInt(x->x));
		
		System.out.println(even);
		
		System.out.println(odd);
		
	}

}
