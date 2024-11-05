package leet;

import java.util.Arrays;

public class Rotate {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int k=2;
		
		int[] result=new int[a.length];
		int size=a.length;
		int id=0;
		for(int i=size-k;i<size;i++) {
			result[id]=a[i];
			id++;
		}
		for(int i=0;i<size-k;i++) {
			result[id]=a[i];
			id++;
		}
		System.out.println(Arrays.toString(result));
		for(int x : result) {
			System.out.println(x);
		}
	}

}
