package collection;

public class Paranthesis {
	
	public static void main(String[] args) {
		
		String a="(()())(())";
		
		String result="";
		int balance=0;
		
		for(char c : a.toCharArray()) {
			if(c=='(') {
				if(balance>0) {
					result=result+c;
				}
				balance++;
			}
			else {
				if(balance>1) {
					result=result+c;
				}
				balance--;
			}
		}
		System.out.println(result);
	}
}