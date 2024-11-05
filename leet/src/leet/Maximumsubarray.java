package leet;

public class Maximumsubarray {
	
	public static void main(String[] args) {
		
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum=0;
		int maxi=a[0];
		
		for(int x : a) {
			sum=sum+x;
			maxi=Math.max(sum, maxi);
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(maxi);
	}

}
