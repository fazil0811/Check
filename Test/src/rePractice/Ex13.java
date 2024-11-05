package rePractice;

public class Ex13 {
	public static void main(String[] args) {
		int a=124;
		int sum=0;
		int temp=a;
		for(;a!=0;) {
			int val=a%10;
			sum=sum+(val*val*val);
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not");
		}
		}
} 