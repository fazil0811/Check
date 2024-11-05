package homeWork;
public class Sum7 {
	public static void main(String[] args) {
		String name="malayalam";
		String name1="";
		for(int i=name.length()-1;i>=0;i--) {
			name1=name1+name.charAt(i);
		}
			if(name.equalsIgnoreCase(name1)) {
				System.out.println("Palindrome");
				
			}
			else {
				System.out.println("Not Plaindrome");
			}
	}

}
