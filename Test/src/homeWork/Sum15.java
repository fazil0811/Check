package homeWork;
public class Sum15 {
	public static void main(String[] args) {
		int[] nums= {32,59,42,49,87};
		int firstmax=0;
		int secondmax=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>firstmax) {
				secondmax=firstmax;
				firstmax=nums[i];
			}
		if(nums[i]>secondmax && nums[i]!=firstmax) {
			secondmax=nums[i];
		}
		}
		System.out.println(firstmax);
		System.out.println(secondmax);		
	}

}
