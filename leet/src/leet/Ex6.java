package leet;
public class Ex6 {
	public static void main(String[] args) {
		int a=211;
		int sum=0;
		for(;a!=0;) {
			int value=a%10;
			sum=sum+value;
			a=a/10;
		}
		System.out.println(sum);
	}

}
