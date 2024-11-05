package homeWork;
public class Sum2 {
	public static void main(String[] args) {
		String name="Samsung";
		String name1=name.toLowerCase();
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name1.charAt(i)=='a'||name1.charAt(i)=='e'||name1.charAt(i)=='i'||name1.charAt(i)=='o'||name1.charAt(i)=='u') {
			count=count+1;	
			}
		}
		System.out.println(count);
	}
}