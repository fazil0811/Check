package learn;

import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {

		int num = 19;
		String z = "";

		while (num != 0) {

			int a = num % 2;
			z = String.valueOf(a).concat(z);
			num = num / 2;
		}
		System.out.println(z);
	}

}
