package eee;

public class Doubt {
	public static void main(String[] args) {
		String a = "udhaya";
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			
			
			if (i % 2 != 0 && a.length()-1!=i) {
				b = b + a.charAt(i) + "/";
			} else {
				b = b + a.charAt(i);
			}
		}
		System.out.println(b);
	}

}
