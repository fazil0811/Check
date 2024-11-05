package leet;

public class Binary {
	public static void main(String[] args) {
		
		int num=20;
		String b="";
		while(num>0) {
			int a=num%2;
			b=String.valueOf(a).concat(b);
			num=num/2;
		}
		System.out.println(b);
	}
}
