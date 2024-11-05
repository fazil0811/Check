package rePractice;
public class Ex1 {
	public static void main(String[] args) {
	String name="botttle";
	int rp=0;
	int nrp=0;
	char[] a=name.toCharArray();
	for(int i=0;i<name.length();i++) {
		int count=0;
		for(int j=i+1;j<name.length();j++) {
			if(a[i]==a[j]) {
				count=count+1;
				a[j]='@';
			}
		}
		if(count>0 && a[i]!='@') {
			rp=rp+1;
		}
		else {
			if(count==0 && a[i]!='@') {
			nrp=nrp+1;
			}
		}
		}
	System.out.println(rp);
	System.out.println(nrp);
	}
}