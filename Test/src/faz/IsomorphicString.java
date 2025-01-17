package faz;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	
	public static void main(String[] args) {
		
		String a="foo";
		String b="add";
		
		Map<Character,Character> map1=new HashMap<>();
		Map<Character,Character> map2=new HashMap<>();
		
		for(int i=0;i<a.length();i++) {
			
			char x=a.charAt(i);
			char y=b.charAt(i);
			
			if(map1.containsKey(x) && map1.get(x)!=y || map2.containsKey(x) && map2.get(x)!=y) {
				System.out.println("false");
				map1.put(x, y);
				map2.put(y, x);
			}
		}
				System.out.println("true");
			
		
	}

}
