package rePractice;
public class Ex2  {
	public static void main(String[] args) {
		String name="udhaya";
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			int count=0;
			for(int j=i+1;j<name.length();j++) {
				if(a[i]==a[j]) {
					count=count+1;
					}
			}
			if(count>0) {
				System.out.println(a[i]);
			}
		}
	}
}
		