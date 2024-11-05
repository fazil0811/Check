package leet;
public class Ex5 {
	    public int removeElement(int[] nums, int val) {
	        int k = 0; // Pointer to place the next valid element

	        // Iterate through the array
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[k] = nums[i]; // Place the valid element at index k
	                k++; // Increment k for the next valid element
	            }
	        }

	        return k; // k is the length of the array with elements not equal to val
	    }

	    public static void main(String[] args) {
	        Ex5 solution = new Ex5();
	        int[] nums = {3, 2, 2, 3};
	        int val = 3;

	        int newLength = solution.removeElement(nums, val);

	        // Print the new length
	        System.out.println("New length: " + newLength);

	        // Print the array up to the new length
	        System.out.print("Array after removal: ");
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(nums[i] + " ");
	        }
	        System.out.println();
	    }
	}
