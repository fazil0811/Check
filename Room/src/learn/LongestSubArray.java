package learn;

public class LongestSubArray {

	public static void main(String[] args) {

		int[] a = { 10, 5, 2, 7, 1, 9 };
		int k = 15;

		int left = 0, right = 0, sum = 0, maxlen = 0;

		while (right < a.length) {
			sum = sum + a[right];

			while (left <= right && sum > k) {
				sum = sum - a[left];
				left++;
			}
			if (sum == k) {
				maxlen = Math.max(maxlen, right - left + 1);
			}
			right++;
		}
		System.out.println(maxlen);

	}

}
