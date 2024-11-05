package leet;

import java.util.HashSet;
import java.util.Set;

public class SubString {

	public static void main(String[] args) {

		String a = "abcdnc";
		int start=0;
		int end=0;
		int max=0;
		
		Set<Character> seen =new HashSet<>();
		while(end<a.length()) {
			char x=a.charAt(end);
			while(seen.contains(x)) {
				seen.remove(a.charAt(start));
				start=start+1;
			}
	seen.add(x);
		int window=end-start+1;
		max=Math.max(max, window);
		end=end+1;
		}
		System.out.println(max);
	}
}