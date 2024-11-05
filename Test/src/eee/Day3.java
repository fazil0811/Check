package eee;
public class Day3 {
	public static void main(String[] args) {
		String name="Madam";
		String value="";
		for(int i=name.length()-1;i>=0;i--) {
			value=value+name.charAt(i);
		}
		if(name.equalsIgnoreCase(value)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
