package Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] a= {2,7,11,15};
		
		int k=9;
		
		int[] b=new int[2];
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==k) {
					b[0]=i;
					b[1]=j;
					break;
				}
			}
		}
		for(int x : b) {
			System.out.println(x);
		}
	}

}
