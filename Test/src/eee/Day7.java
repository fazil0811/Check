package eee;
public class Day7 {
	public static void main(String[] args) {
		String name1="malayalam";
		String name2="";
		for(int i=name1.length()-1;i>=0;i--) {
			name2=name2+name1.charAt(i);
		}
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		}
	}


