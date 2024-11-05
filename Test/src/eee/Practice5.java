package eee;
public class Practice5 {
	public static void main(String[] args) {
		String name="fad37";
		int total=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='0' && name.charAt(i)<='9') {
				total=total+1;
				System.out.println(name.charAt(i));
			}
		}
		System.out.println(total);
	}
}	