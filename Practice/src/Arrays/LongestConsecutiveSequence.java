package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int[] nums = { 100, 4, 200, 1, 3, 2, 2 };
		int longest = 0;

		Set<Integer> a = new HashSet<>();

		for (int x : nums) {
			a.add(x);
		}

		for (int z : a) {
			// if (!a.contains(z - 1)) {
			int count = 1;

			while (a.contains(z + 1)) {
				z++;
				count++;
			}
			longest = Math.max(count, longest);
		}

		System.out.println(longest);

	}

}
