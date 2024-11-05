package collection;

public class Doubt {

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 2, 2, 0, 5, 3 };
		int maxi = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				count++;
				if (count > maxi) {
					maxi = count;
				}
			} else {
				count = 0;
			}
		}

		System.out.println(maxi);
	}
}