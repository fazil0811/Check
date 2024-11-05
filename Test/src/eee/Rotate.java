package eee;

public class Rotate {

	public static void main(String[] args) {

		int[] a = {0, 1, 3, 0, 2, 4, 0, 1 };

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