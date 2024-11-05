package leet;

public class Last {
	
	public static void main(String[] args) {
		
		int[] a= {3,4,5,2,8};
		
//		int first=a[0];
//		for(int i=1;i<a.length;i++) {
//			a[i-1]=a[i];
//		}
//		a[a.length-1]=first;
//		for(int x : a) {
//			System.out.println(x);
//		}
		
		
		int[] b=new int[a.length];
		int first=a[0];
		for(int i=1;i<a.length;i++) {
			b[i-1]=a[i];
		}
		b[a.length-1]=first;
		for(int x : b) {
			System.out.println(x);
		}
	}
}