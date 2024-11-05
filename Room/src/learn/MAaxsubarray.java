package learn;

public class MAaxsubarray {
	
	public static void main(String[] args) {
		
		int[] a= {5,4,-1,7,8};
		
		int sum=0;
		int max=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(sum>max) {
				max=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
	}

}
