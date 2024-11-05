package learn;

import java.util.Arrays;

public class AddArray {
	
	public static void main(String[] args) {
		
		int[] a= {5,3,5};
		int[] b= {4,3,5};
		
		int[] num=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			num[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			num[i+a.length]=b[i];
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int x : num) {
			System.out.println(x);                                  
		}
	}
}