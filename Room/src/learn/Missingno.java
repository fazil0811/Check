package learn;

public class Missingno {

	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 1, 0 };

		int sum = 0;
		int n = a.length;
		int tot = n * (n + 1) / 2;

		for (int x : a) {
			sum = sum + x;
		}
		int total = tot - sum;
		System.out.println(total);
	}

}
