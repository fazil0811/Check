package task;
public class Ex1 {
	public static void main(String[] args) {
		int[] nums= {2,6,4,3};
		int max=nums[0];
		int total=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		for(int i=1;i<=max;i++) {
			total=total*i;
			System.out.println(total);
			
		}
	}
}
	