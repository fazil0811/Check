package Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		int count = 1;

		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] != a[i]) {
				a[count] = a[i];
				count++;
			}
		}
		System.out.println(count);
	}

}