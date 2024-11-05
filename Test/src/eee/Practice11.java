package eee;
public class Practice11 {
	public static void main(String[] args) {
		int num=10;
		boolean value=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				value=true;
		}
		}
		if(value==true) {
			System.out.println("Not");
		}
		else {
			System.out.println("prime");
		
			
		}
	}

}
