package rePractice;

public class Task7 {

	public static void main(String[] args) {

		String a = "529";
		int ans = 0;
		for (int i = 0; i < a.length(); i++) {
			int value = a.charAt(i)-'0';
			ans = (ans * 10) + value;

		}
		System.out.println(ans);
	}

}
