package eee;
public class Day9 {
	public static void main(String[] args) {
		String name="udha23y1a";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='0' && name.charAt(i)<='9') {
				count=count+1;
				//System.out.println(count);
			}
		}
		System.out.println(count);
	}

}
