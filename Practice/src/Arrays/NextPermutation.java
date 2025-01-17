package Arrays;

public class NextPermutation {

	public static void main(String[] args) {

		int[] a = { 1, 5, 4, 3, 2 };

		int n = a.length;

		int i = n - 2;

		while (i >= 0 && a[i] >= a[i + 1]) {
			i--;
		}
		if (i >= 0) {
			int j = n - 1;

			while (a[j] <= a[i]) {
				j--;
			}
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		for (int j = i + 1; j < n ; j++) {
			for (int k = j + 1; k < n; k++) {
				if (a[j] > a[k]) {
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}

		for (int x : a) {
			System.out.println(x);
		}

	}

}
