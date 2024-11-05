package rePractice;
public class Ex7 {
	public static void main(String[] args) {
		int[] nums= {43,34,42,34,34,23,42};
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count=count+1;
					nums[j]='@';
				}
			}
			if(count>0 && nums[i]!='@') {
				System.out.println(nums[i]);
			}
		}
	}
}