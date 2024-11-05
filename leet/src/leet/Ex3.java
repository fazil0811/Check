package leet;
public class Ex3 {
	public static void main(String[] args) {
		int[] a= {2,5,0,3,6};
		int  b=5;
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==b) {
					count=j;
				}
			}
					System.out.println(i+" "+count);
					break;
				}
			
	}

}
