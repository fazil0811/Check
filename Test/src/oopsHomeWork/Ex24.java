package oopsHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex24 {
	
	public static void main(String[] args) {
		
		List<Integer>nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer>num=nums.stream().filter(x->x!=4).map(x->x).collect(Collectors.toList());
		
		num.forEach(x->System.out.println(x));
	}

}
