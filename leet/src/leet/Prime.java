package leet;

public class Prime {

	public static void main(String[] args) {
		int a = 54;

		for (int i = 2; i < a; i++) {
			boolean value = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					value = false;
					break;
				}
			}
			if (value == true) {
				System.out.println(i);
			}
		}
	}
}