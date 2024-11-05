package collection;

public class Anagaram {

	public static void main(String[] args) {

		String a = "treee";
		String b = "ertef";

		boolean value = true;

		int[] count = new int[26];

		for (char x : a.toCharArray()) {
			count[x - 'a']++;	
		}

		for (char y : b.toCharArray()) {
			count[y - 'a']--;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				value = false;
			}
		}
		if (value == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
