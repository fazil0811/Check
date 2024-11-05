package leet;

import java.util.Arrays;

public class Addarr {
	public static void main(String[] args) {
		
		int[] a= {1,4,2};
		int[] b= {3,4,5};
		
		int[] c=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+b.length]=b[i];
		}
		for(int x : c) {
			System.out.println(x);
		}
	}
}