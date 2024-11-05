package homeWork;
public class Task1 {
	public static void main(String[] args) {
		int[] nums= {1, 2, 2, 3, 5, 3, 5, 3};
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count=count+1;
					nums[j] = '%';
				}
			}
			if(count>0 && nums[i] != '%') {
				System.out.println(nums[i]);
				}
		}
		
	}

}
