package homeWork;
public class Task4 {
	public static void main(String[] args) {
		String name="whw345dfd";
		char[] c=name.toCharArray();
		for(int i=name.length()-1;i>0;i--) {
			if(c[i]=='3') {
				continue;
			}
			else {
				System.out.print(c[i]);
			}
			
		}
	}

}
