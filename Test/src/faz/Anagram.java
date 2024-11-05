package faz;

public class Anagram {

	public static void main(String[] args) {

		String a = "tree";
		String b = "ertee";

		int[] count = new int[26];

		boolean value = true;

		for (char x : a.toCharArray()) {
			count[x - 'a']++;
		}

		for (char y : b.toCharArray()) {
			count[y - 'a']--;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				value = false;
				break;
			}
		}

		if (value == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}