package eee;
public class Practice10 {
	public static void main(String[] args) {
		String name="Kerala";
		String value="";
		for(int i=name.length()-1;i>=0;i--) {
			value=value+name.charAt(i);
		}
		if(name.equalsIgnoreCase(value)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
