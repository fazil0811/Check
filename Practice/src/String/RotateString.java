package String;

public class RotateString {
	
	public static void main(String[] args) {
		
		String a="abcde";
		String b="abced";
		
		String c=a.concat(a);
		
		if(c.contains(b)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
