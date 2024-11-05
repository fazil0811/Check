package leet;

public class Findbinary {
	public static void main(String[] args) {

		double num = 25.34;
//		String x="";
		int a = (int) num;
		double b = num - a;
		String x = Integer.toBinaryString(a);
//		while(a>0) {
//		int f=a%2;
//		x=String.valueOf(f).concat(x);
//		a=a/2;
//		}
		String c = "";
		int count = 0;
		while (count < 10) {
			b = b * 2;
			int d = (int) b;
			c = c + d;
			b = b - d;
			count++;
		}
		System.out.println(x + "." + c);
	}

}
