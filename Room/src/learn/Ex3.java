package learn;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {9,99,7};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
//		for(int i=0;i<c.length;i++) {
//			for(int j=i+1;j<c.length;j++) {
//				if(c[i]>c[j]) {
//					int temp=c[i];
//					c[i]=c[j];
//					c[j]=temp;
//				}
//			}
//		}
//		for(int x:c) {
//			System.out.print(x+" ");
//		}
		System.out.println(c);
	}
	}

