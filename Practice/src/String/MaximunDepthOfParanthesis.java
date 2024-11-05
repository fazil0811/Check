package String;

public class MaximunDepthOfParanthesis {

	public static void main(String[] args) {

		String a = "(1+(2*3)+((8)/4))+1";
		int count = 0;
		int total = 0;

		for (char x : a.toCharArray()) {
			if (x == '(') {
				count++;
				total = Math.max(total, count);
			}

			else {
				if (x == ')') {
					count--;
				}
			}
		}
		System.out.println(total);
	}
}
