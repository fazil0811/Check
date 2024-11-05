package Arrays;

public class MovesZero {

	public static void main(String[] args) {

		int[] a = { 0, 1, 0, 3, 12 };

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