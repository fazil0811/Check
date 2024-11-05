package leet;

public class Shift {

	public static void main(String[] args) {

		int[] a = { 4, 0, 4, 3, 0, 2, 0, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == 0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

			System.out.println(a[i]);
		}
	}
}