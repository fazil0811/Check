package String;

import java.util.HashSet;
import java.util.Set;

public class CountSubStrings {

	public static void main(String[] args) {

		String a = "abaaca";
		int k=1;

		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			Set<Character> set = new HashSet<>();
			for (int j = i; j < a.length(); j++) {
				set.add(a.charAt(j));

				if(set.size()==k) {
					count++;
				}
				else if(set.size()>k) {
					break;
				}
			}
		}

		System.out.println(count);
	}

}
