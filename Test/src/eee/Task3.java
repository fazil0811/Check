package eee;
public class Task3 {
	public static void main(String[] args) {
		int a=2356;
		int sum=0;
		while(a>0) {
			int digit=a%10;
			sum=sum+digit;
			a=a/10;
			}
		System.out.println(sum);
	}

}
