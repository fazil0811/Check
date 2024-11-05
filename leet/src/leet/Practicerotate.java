package leet;

import java.util.Arrays;

public class Practicerotate {

	public static void main(String[] args) {
		
		int[] num= {4,5,2,1,3};
		int k=3;
		
		int[] fin=new int[num.length];
		int a=num.length;
		int b=0;
		
		for(int i=a-k;i<num.length;i++) {
			fin[b]=num[i];
			b++;
		}
		for(int i=0;i<k-1;i++) {
			fin[b]=num[i];
			b++;
		}
		System.out.println(Arrays.toString(fin));
		

	}

}
