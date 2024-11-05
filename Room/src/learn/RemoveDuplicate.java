package learn;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] a = { 4, 2, 4, 1, 3, 6, 3, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int c = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] != a[i]) {
				a[c] = a[i];
				c++;
			}
		}
		System.out.println(c);
	}
}
