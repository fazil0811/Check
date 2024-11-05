package leet;

import java.util.HashSet;
import java.util.Set;

public class Task {

	public static void main(String[] args) {

		String a = "abcbvd";
		int start = 0;
		int end = 0;
		String x = "";

		Set<Character> seen = new HashSet<>();
		while (end < a.length()) {
			char z = a.charAt(end);
			while (seen.contains(a.charAt(end))) {
				seen.remove(a.charAt(start));
				start++;
			}
			seen.add(z);
			if (end - start + 1 > x.length()) {
				x = a.substring(start, end + 1);
			}
			end++;
		}
		System.out.println(x);
	}
}
