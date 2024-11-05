package learn;

public class Checksorted {

	public static void main(String[] args) {

		int[] nums = { 2, 1, 3, 4 };
		boolean value=true;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= nums[i + 1]) {
				value=true;
			}
			else {
				value=false;
				break;
			}
		}
		if(value==false) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
	}
}