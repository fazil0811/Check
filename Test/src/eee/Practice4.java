package eee;
public class Practice4 {
	public static void main(String[] args) {
		String name="fAzIl";
		String name1=name.toLowerCase();
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=name1.charAt(i)) {
				count=count+1;
				System.out.println(name.charAt(i));
			}
		}
		System.out.println(count);
	}

}
