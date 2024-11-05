package learn;

public class Last {
	
	public static void main(String[] args) {
		
		int[] a= {3,4,2,4,2};
		
		int l=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			a[i-1]=a[i];
		}
		a[a.length-1]=l;
		for(int x : a) {
			System.out.println(x);
		}
	}

}
