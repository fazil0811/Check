package Arrays;

public class MaximumSubArray {
	
	public static void main(String[] args) {
		
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		
		int max=0;
		int total=0;
		
		for(int x : a) {
			total=total+x;
			max=Math.max(max, total);
			if(total<0) {
				total=0;
			}
		}		
		System.out.println(max);
	}
}
	