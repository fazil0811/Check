package Arrays;

public class MaximunSubArray1 {
	
	public static void main(String[] args) {
		
		int[] a= {1, 2, 7, -4, 3, 2, -10, 9, 1};
		
		int max=0;
		int sum=0;
		
		for(int x : a) {
			sum=sum+x;
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
	}

}
