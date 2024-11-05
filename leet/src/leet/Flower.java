package leet;

public class Flower {
	public static void main(String[] args) {

		String[] a = { "flower", "flow", "floght" };
		String[] x = a[0].split("");
		String[] y = a[1].split("");
		String[] z = a[2].split("");
		String f = "";
		int minlength=Math.min(Math.min(x.length, y.length), z.length);
		
		for(int i=0;i<minlength;i++) {
			if(x[i].equals(y[i]) && x[i].equals(z[i])) {
				f=f+x[i];
			}
		}
		System.out.println(f);
	}
}