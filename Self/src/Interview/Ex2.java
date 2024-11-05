package Interview;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int[] a= {1,1,2,2,3,4,4};
		
		int count=1;
		
		for(int i=1;i<a.length;i++) {
			if(a[i-1]!=a[i]) {
				a[count]=a[i];
				count++;
			}
			
		}
		for(int i=0;i<count;i++) {
			System.out.println(a[i]);
		}
	}

}
