package oopsHomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		List<Integer>third=Arrays.asList(10,43,55,23,75,23,76,35);
		int thirdMax=third.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(thirdMax);
	}

}
