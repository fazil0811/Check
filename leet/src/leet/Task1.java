package leet;

import java.util.Arrays;

public class Task1 {
	
	public static void main(String[] args) {
		
		int[] a= {4,2,4,1,7,2,9,0};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int z=a[i];
					a[i]=a[j];
					a[j]=z;
				}
			}
//			System.out.println(a[i]);
		}
		
		int count=1;
		for(int i=1;i<a.length;i++) {
			if(a[i-1]!=a[i]) {
				a[count]=a[i];
				count++;
			}
		}
//		System.out.println(count);
		for(int i=0;i<count;i++) {
			System.out.println(a[i]);
		}
	}

}
