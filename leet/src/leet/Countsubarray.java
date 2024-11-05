package leet;

public class Countsubarray {
	
	public static void main(String[] args) {
		
		int[] a= {3, 1, 2,1,3, 4,1};
		int k=6;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
