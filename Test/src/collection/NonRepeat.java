package collection;

public class NonRepeat {
	public static void main(String[] args) {

		int[] a = { 4, 1, 2, 1, 2, 5 };

		

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i!=j && a[i] == a[j]) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println(a[i]);
			}
		}
	}

}
