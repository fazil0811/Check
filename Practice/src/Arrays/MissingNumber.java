package Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,4,5};
		int n=5;
		
		int sum=0;
		int c=n*(n+1)/2;
		
		
		for(int z : a) {
			sum=sum+z;
		}
		
		int total=c-sum;
		System.out.println(total);
	}

}
