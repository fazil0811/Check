package learn;

public class Removedup {

	public static void main(String[] args) {

		int[] a = { 1, 1, 3, 3, 3, 5, 5, 6 };

		int count = 1;

		for (int i = 1; i < a.length; i++) {

			if (a[i - 1] != a[i]) {
				a[count] = a[i];
				count++;
			}
		}
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println(a[i]);
		}
	}

}
