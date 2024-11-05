package Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		int[] x = new int[a.length];
		int b = a.length;
		int count = 0;

		for (int i = b - k; i < a.length; i++) {
			x[count] = a[i];
			count++;
		}
		for (int i = 0; i < a.length - k; i++) {
			x[count] = a[i];
			count++;
		}

		for (int z : x) {
			System.out.println(z);
		}
	}

}
