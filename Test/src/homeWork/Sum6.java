package homeWork;
public class Sum6 {
	public static void main(String[] args) {
		int[] nums= {54,32,53,52,13};
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println(min);
		if(min%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
