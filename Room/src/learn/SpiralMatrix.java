package learn;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 },
				      { 5, 6, 7, 8 },
				      { 9, 10, 11, 12 },
				      { 13, 14, 15, 16 } };

		int top = 0, left = 0, right = a.length - 1, bottom = a[0].length - 1;

		List<Integer> ans = new ArrayList<>();

		while (left <= right && top <= bottom) {

			for (int i = left; i <= right; i++) {
				ans.add(a[top][i]);
			}
				top++;

			for (int i = top; i <= bottom; i++) {
				ans.add(a[i][right]);
			}
				right--;
			

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					ans.add(a[bottom][i]);
				}
					bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					ans.add(a[i][left]);
				}
					left++;
			}
		}
		System.out.println(ans);
	}

}
