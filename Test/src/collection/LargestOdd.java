package collection;

public class LargestOdd {

	public static void main(String[] args) {

		String a = "35427";
		String z = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if ((c - '0') % 2 == 1) {
				z = z + c;
			}
		}
		System.out.println(z);
	}
}