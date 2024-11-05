package eee;
public class Practice1 {
	public static void main(String[] args) {
		int a=11;
		boolean value=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				value=false;
			}
		}
		if(value==true) {
				System.out.println("prime");
			} 
			else {
				System.out.println("not prime");
			}
			
		
	}

}
