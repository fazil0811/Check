package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex20 {
	
	public static void main(String[] args) {
		
		List<Integer>num=Arrays.asList(10,43,54,64,33);
		
		int sum=num.stream().collect(Collectors.summingInt(x->x));
		
		float nums=(float)sum;
		
		System.out.println(nums);
	}

}
