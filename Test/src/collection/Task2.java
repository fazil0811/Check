package collection;

public class Task2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 3, 3,  7, 8 };
		int maxi = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					count++;
				}
				if (count > maxi) {
					maxi = count;
				} else {
					count = 0;
				}

			}
		}
		System.out.println(maxi);
	}

}
