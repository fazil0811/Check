package String;

import java.util.HashMap;

public class IsomorphicString {

	public static void main(String[] args) {

		String x = "add";
		String y = "foo";

		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();

		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			char b = y.charAt(i);
			if (map1.containsKey(a) && map1.get(a) != b || map2.containsKey(b) && map2.get(b) != a)
				System.out.println("false");
			map1.put(a, b);
			map2.put(b, a);
		}
		System.out.println("true");
	}
}
