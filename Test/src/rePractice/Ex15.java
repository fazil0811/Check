package rePractice;
public class Ex15 {
	public static void main(String[] args) {
		int start=2;
		int end=9;
		for(int i=start;i<end;i++) {
			boolean value=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					value=false;
				}
			}
			if(value==true) {
				System.out.println("prime"+ i);
				}
			else {
				System.out.println("non prime"+ i);
 			}
		}
	}

}
