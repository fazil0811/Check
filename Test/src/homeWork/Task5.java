package homeWork;
public class Task5 {
	public static void main(String[] args) {
		String[] names= {"i","am","developer"};
		String a="";
		for(int i=0;i<names.length;i++) {
			char[] c=names[i].toCharArray();
			a=a+names[i].toCharArray();
			
			System.out.print(a);
		}
	}

}
