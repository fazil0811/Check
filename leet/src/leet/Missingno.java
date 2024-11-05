package leet;

public class Missingno {
	
	public static void main(String[] args) {
		
		int[] a= {9,6,4,2,3,5,7,0,1};
		
		int n=a.length;
		int sum=0;
		
		int t1=n*(n+1)/2;
		
		for(int x : a) {
			sum=x+sum;
		}
		int mis=t1-sum;
		System.out.println(mis);
	}

}
