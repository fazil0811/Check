package rePractice;
public class Ex11 {
	public static void main(String[] args) {
		String name="abfcd";
		char[] c=name.toCharArray();
		char temp=' ';
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			System.out.println(c[i]);
		}
	}
}