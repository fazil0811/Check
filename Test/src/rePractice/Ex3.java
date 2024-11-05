package rePractice;
public class Ex3 {
	public static void main(String[] args) {
		String name="ramkumar";
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			int count=1;
			for(int j=i+1;j<name.length();j++) {
				if(i!=j && a[i]==a[j]) {
					count=count+1;
					a[j]='@';
				}
			}
			if(count>1 && a[i]!='@') {
				System.out.println(a[i]+" "+count);
			}
		}
	}
}