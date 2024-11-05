package collection;

public class Rotate {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int k=3;
		
		int[] b=new int[a.length];
		int count=0;
		
		for(int i=a.length-k;i<a.length;i++) {
			b[count]=a[i];
			count++;
		}
		for(int i=0;i<a.length-k;i++) {
			b[count]=a[i];
			count++;
		}
		for(int x : b) {
			System.out.println(x);
		}
	}

}
