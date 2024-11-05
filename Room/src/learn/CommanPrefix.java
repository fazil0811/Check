package learn;

public class CommanPrefix {

	public static void main(String[] args) {

		String[] a = { "flower", "flow", "flight" };

		String[] x = a[0].split("");
		String[] y = a[1].split("");
		String[] z = a[2].split("");
		String b = "";

		int min = Math.min(Math.min(x.length, y.length), z.length);

		for (int i = 0; i < min; i++) {
			if (x[i].equals(y[i]) && x[i].equals(z[i])) {
				b = b + x[i];
			}
		}
		System.out.println(b);
	}

}
