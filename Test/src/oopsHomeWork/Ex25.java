package oopsHomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex25 {
	public static void main(String[] args) {
		List<Integer>num=Arrays.asList(10,54,54,35,76,65,78);
		List<Integer>nums=num.stream().map(x->x).sorted().collect(Collectors.toList());
		nums.forEach(x->System.out.println(x));
		System.out.println("@@@@@@@@@@@@@@");
		
		List<Integer>nums1=num.stream().map(x->x).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		nums1.forEach(x->System.out.println(x));
		
		int nums2=num.stream().map(x->x).sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(nums2);
	}

}
