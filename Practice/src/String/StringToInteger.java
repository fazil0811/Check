package String;

public class StringToInteger {
	
	public static void main(String[] args) {
		
		String a="42";
		 
		int total=0;
		
		for(int i=0;i<a.length();i++) {
			
			int value=a.charAt(i)-'0';
			total=(total*10)+value;
		}
		System.out.println(total);
	}

}
