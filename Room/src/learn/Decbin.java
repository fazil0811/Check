package learn;

public class Decbin {
	
	public static void main(String[] args) {
		
		double num=25.34;
		int a=(int)num;
		double b=num-a;
		
		String x="";
		while(a>0) {
			int c=a%2;
			x=String.valueOf(c).concat(x);
			a=a/2;
		}
		
		String z="";
		int count=0;
		
		while(count<10) {
			b=b*2;
			int f=(int)b;
			z=z+f;
			b=b-f;
			count++;
		}
		System.out.println(x+ "."+ z);
	}

}
