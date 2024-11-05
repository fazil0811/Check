package homeWork;
public class Sum17 {
	public static void main(String[] args) {
		int[] nums= {32,-43,56,-24,53};
		int total=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				total=nums[i]+total;
			}
		}
		System.out.println(total);
	}

}
