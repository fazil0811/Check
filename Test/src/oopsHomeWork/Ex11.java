package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex11 {
	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(10,43,65,74,66,35);
		int sum=nums.stream().filter(x->x%2==0).collect(Collectors.summingInt(x->x));
		System.out.println(sum);
	}

}
 