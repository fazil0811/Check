package Arrays;

public class LongestSubArray {
	
	public static void main(String[] args) {
		
		int[] a= {10, 5, 2, 7, 1, 9};
		int k=15;
		
		int right=0,left=0,max=0,sum=0;
		
		while(right<a.length) {
			sum=sum+a[right];
			
			while(left<=right & sum>k) {
				sum=sum-a[left];
				left++;
			}
			
			if(sum==k) {
				max=Math.max(max, (right-left)+1);
			}
			right++;
		}
		System.out.println(max);
	}

}
