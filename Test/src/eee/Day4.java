package eee;
public class Day4 {
	public static void main(String[] args) {
		String name="madam";
		boolean value=false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				value=true;
			}
		}
				if(value==true) {
				System.out.println("vowels");
			}
			else {
				System.out.println("not vowels");
			}
	}
}
