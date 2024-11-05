package rePractice;
public class Ex16 {
	public static void main(String[] args) {
		int[] a= {43,86,2,6,7};
		int[] b= {2,6,3,8,33};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println(a[i]);
			}
		}
		for(int i=0;i<b.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println(b[i]);
			}
		}
	}
}
