package Arrays;

public class StockSell {

	public static void main(String[] args) {

		int[] a = { 7, 1, 5, 3, 6, 4 };

		int max = 0;
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			int cost = a[i] - min;

			max = Math.max(max, cost);
			min = Math.min(min, a[i]);
		}
		System.out.println(max);
	}
}
