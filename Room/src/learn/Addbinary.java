package learn;

public class Addbinary {
	
	public static void main(String[] args) {
		
		int a=19;
		int z=0;
		
		while(a!=0) {
			int b=a%2;
			z=z+b;
			a=a/2;
		}
		System.out.println(z);
	}

}
