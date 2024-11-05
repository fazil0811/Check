package collection;

public class maxiSubArray {

	public static void main(String[] args) {

		int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxi = a[0];
		int sum = 0;

//		for(int i=0;i<a.length;i++)  {
//			sum=sum+a[i];
//			if(sum>maxi) {
//				maxi=sum;
//			}
//			if(sum<0) {
//				sum=0;	
//				
//			}
//		}
//		System.out.println(maxi);

		for (int x : a) {
			sum = sum + x;
			maxi = Math.max(sum, maxi);

			if (sum < 0) {
				sum = 0;
			}

		}
		System.out.println(maxi);
	}

}
