package collection;

public class Max {
	
	public static void main(String[] args) {
		
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		
		int count=0,maxi=0;
		
		for(int i=0;i<a.length;i++) {
			count=count+a[i];
			if(count>maxi) {
				
				maxi=count;
			}
			if (count<0) {
				count=0;
			}
		}
		System.out.println(maxi);
	}

}
