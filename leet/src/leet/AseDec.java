package leet;

import java.util.Arrays;

public class AseDec {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] z = new int[2];
		int fm = 0;
		int sm = 0;
		int maf = a[0];
		int mas = a[0];

		for (int x : a) {
			if (x > fm) {
				sm = fm;
				fm = x;
			}
			if (x > sm && x != fm) {
				sm = x;
			}
		}

		for (int x : a) {
			if (x < maf) {
				mas = maf;
				maf = x;
			}
			if (x < mas && x != maf) {
				mas = x;
			}
		}
		z[0] = sm;
		z[1] = mas;
		for (int x : z) {
			System.out.println(x);
		}
	}
}