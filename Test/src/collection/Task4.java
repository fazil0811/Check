package collection;

public class Task4 {

	public static void main(String[] args) {

		int[] a = { 1, 1, 0, 1, 1, 1 };
		int max = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (i != j && a[i] == a[j]) {
					count++;
					if (count > max) {
						max = count;
						System.out.println(a[i]);
					}
				} else {
					count = 0;
				}
			}

		}
	}

}
