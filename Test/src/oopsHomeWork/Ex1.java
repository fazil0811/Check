package oopsHomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex1 {
	public static void main(String[] args) {
		List<Integer> val = Arrays.asList(10, 20, 30, 10, 30);
		List<Integer> values = val.stream().filter(e -> Collections.frequency(val, e) > 1).distinct().collect(Collectors.toList());
		values.forEach(z -> System.out.println(z));
	}
}
