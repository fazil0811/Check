package rePractice;

import java.util.Arrays;

public class Ex12 {
	public static void main(String[] args) {
		int[] a= {43,86,2,6,7};
		int[] b= {2,6,3,8,33};
		int[] nums=new int[a.length + b.length];
		int i=0;
		for(int z:a) {
			nums[i++]=z;
		}
		//System.out.println(Arrays.toString(nums));
		for(int z:b) {
			nums[i++]=z;
		}
		for(int z:nums) {
			System.out.print(z+" ");
		}
	}
}