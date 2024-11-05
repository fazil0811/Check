package collection;

public class Distinct {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6 };
		int[] b = { 2, 3, 5 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}

		int count = 1;

		for (int i = 1; i < c.length; i++) {
			if (c[i - 1] != c[i]) {
				c[count] = c[i];
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(c[i]);
		}
	}

}
