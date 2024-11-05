package task;

public class Palindrome {
	public static void main(String[] args) {
		int a = 100;
		int b = 999;

		for (int i = a; i < b; i++) {
			int temp = i;
			int sum = 0;
			for (; temp != 0;) {
				int digit = temp % 10;
				sum = (sum * 10) + digit;
				temp = temp / 10;
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}
}
