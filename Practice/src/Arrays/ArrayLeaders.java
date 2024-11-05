package Arrays;

public class ArrayLeaders {
	
	public static void main(String[] args) {
		
		int[] a= {16, 17, 4, 3, 5, 2};
		
		for(int i=0;i<a.length;i++) {
			boolean value=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					value=false;
					break;
				}
			}
			if(value==true) {
				System.out.println(a[i]);
			}
		}
	}
}	