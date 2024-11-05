package String;

public class Anagram {
	
	public static void main(String[] args) {
		 
		String a="faziel";
		String b="laafzi";
		
		boolean value=true;
		
		int[] c=new int[26];
		
		for(char x : a.toCharArray()) {
		c[x-'a']++;	
		}
		
		for(char y : b.toCharArray()) {
			c[y-'a']--;
		}
		
		for(int i=0;i<c.length;i++) {
			if(c[i]!=0) {
				value=false;
			}
		}
		if(value==true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
