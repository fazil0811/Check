package learn;

public class Rotate {

	public static void main(String[] args) {

		int[] a = { 4, 2, 4, 6, 3, 6 };
		int k = 3;

		int[] fin = new int[a.length];
		int size = a.length;
		int c = 0;

		for (int i = size - k; i < size; i++) {
			fin[c] = a[i];
			c++;
		}
		for (int i = 0; i < size - k; i++) {
			fin[c] = a[i];
			c++;
		}

		for (int x : fin) {
			System.out.println(x);
		}
	}

}
