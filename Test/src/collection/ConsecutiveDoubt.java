package collection;

public class ConsecutiveDoubt {

	public static void main(String[] args) {

		int[] a = { 1, 1, 3, 3, 3, 4, 3 };

		int count = 0, max = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					count++;
					if (count > max) {
						a[max] = a[i];
						max = count;

					}
				} else {
					count = 0;
				}
			}
		}
		for (int i = 0; i < max; i++) {
			System.out.println(a[i]);
		}
	}

}
