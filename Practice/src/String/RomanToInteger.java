package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	public static void main(String[] args) {
		
		String a="LVIII";
		
		Map<Character, Integer> map1= new HashMap<>();
		
		map1.put('I', 1);
		map1.put('V', 5);
		map1.put('X', 10);
		map1.put('L', 50);
		map1.put('C', 100);
		map1.put('D', 500);
		map1.put('M', 1000);
		
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			
			if(i < a.length()-1 && map1.get(c)<map1.get(a.charAt(i+1))) {
				count=count+map1.get(a.charAt(i+1))-map1.get(a.charAt(i));
			}
			else {
				count=count+map1.get(c);
			}
		}
		System.out.println(count);
	}

}
