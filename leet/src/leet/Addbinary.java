package leet;

public class Addbinary {
	
	public static void main(String[] args) {
		
		int num=9;
		int z=0;
		
		while(num!=0) {
			int nums=num%2;
			z=z+nums;
			num=num/2;
			
		}
		System.out.println(z);
			
	}

}
