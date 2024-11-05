package homeWork;
public class Sum18 {
	public static void main(String[] args) {
		int num=26;
		boolean value=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				value=true;
			}
		}
		if(value==true) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
