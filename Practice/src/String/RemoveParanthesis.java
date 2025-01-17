package String;

public class RemoveParanthesis {

	public static void main(String[] args) {

		String a = "(()())(())";

		int count = 0;
		String result = "";

		for (char x : a.toCharArray()) {

			if (x == '(') {	
				if (count > 0) {
					result = result + x;
				}
				count++;
			}
			else {
				if (x == ')') {
					count--;

					if (count > 0) {
						result = result + x;
					}
				}
			}
		}
		System.out.println(result);
	}
}