package homeWork;
public class Sum9 {
	public static void main(String[] args) {
		int[] nums= {5,-5,34,-23,53};
		int total=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				total=total+nums[i];
			}
		}
		System.out.println(total);
	}

}
