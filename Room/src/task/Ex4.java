package task;
public class Ex4 {
	public static void main(String[] args) {
		int num=7;
		boolean value=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				value=true;
			}
		}
		if(value==true) {
			
				System.out.println("no");
			}
			else {
				System.out.println("yes");
			}
	}
}
