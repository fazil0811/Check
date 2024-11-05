package collection;

public class SubArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 1, 1, 1 };
        int k = 3;

        int right = 0, left = 0;
        int sum = 0;
        int maxlen = 0;

        while (right < a.length) {
            // Add the current right element to sum
            sum += a[right];
            
            // Adjust the left pointer if the sum exceeds k
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // Check if the sum equals k
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }

            right++; // Move the right pointer to the right
        }
        
        System.out.println(maxlen);
    }
}
