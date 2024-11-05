package leet;

public class Lrotae {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int k = 3;

		int[] fin = new int[a.length];
		int c = 0;

		for (int i = k; i < a.length; i++) {
			fin[c] = a[i];
			c++;
		}
		for (int i = 0; i < k; i++) {
			fin[c] = a[i];
			c++;
		}
		for (int x : fin) {
			System.out.println(x);
		}
	}

}
