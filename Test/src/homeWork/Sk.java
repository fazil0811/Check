package homeWork;

public class Sk {
	public static void main(String[] args) {
		int[] a = { 2, 0, 6, 0, 4, 0, 5, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (i != j && a[i] == 0) {
					int k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}

			System.out.println(a[i]);
		}
		
	}
}