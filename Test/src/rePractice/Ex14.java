package rePractice;
public class Ex14 {
	public static void main(String[] args) {
		int a=414;
		int sum=0;
		int temp=a;
		for(;a>0;) {
			int val=a%10;
			sum=(sum*10)+val;
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}

}
