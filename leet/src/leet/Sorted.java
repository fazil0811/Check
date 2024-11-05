package leet;

import java.util.ArrayList;

public class Sorted {

	public static void main(String[] args) {
		
		int[] nums= {5,7,7,8,8,10};
		int target=8;
		
		ArrayList<Integer>find=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
                if(nums[i]==target) {
                	find.add(i);
                	}
        }
        System.out.println(find);
	}
	
	
//	public int[] searchRange() {
//		int[] nums= {5,7,7,8,8,10};
//		int[] a=new int[] {};
//		int target=8;
//		for(int i=0;i<nums.length;i++) {
//         if(nums[i]==target) {
//        	 return new int[] {i};
//         }
//		}
//		return new int[] {};
//	
//	}
}
               