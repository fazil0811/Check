package Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		int firstmax = 0, secondmax = 0, firstmin = 999, secondmin = 999;
		int[] z = new int[2];

		for (int x : a) {
			if (x > firstmax) {
				secondmax = firstmax;
				firstmax = x;
			}
			if (x > secondmax && x != firstmax) {
				secondmax = x;
			}
		}

		for (int y : a) {
			if (y < firstmin) {
				secondmin = firstmin;
				firstmin = y;
			}
			if (y < secondmin && y != firstmin) {
				secondmin = y;
			}
		}

		z[0] = secondmax;
		z[1] = secondmin;

		for (int f : z) {
			System.out.println(f);
		}
		System.out.println(secondmax);
	}
}