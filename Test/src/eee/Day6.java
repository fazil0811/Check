package eee;
public class Day6 {
	public static void main(String[] args) {
		String name="fAzIl";
		String name1=name.toLowerCase();
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name1.charAt(i)!=name.charAt(i)) {
				//System.out.println(i);
				count=count+1;
				System.out.println(count);
			}
		}
	}
}