package homeWork;
public class Sum16 {
	public static void main(String[] args) {
		int[] nums= {89,64,24,75,36};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums[i]);
				}
	}
}