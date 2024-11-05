package rePractice;
public class Exx10 {
	public static void main(String[] args) {
		String a="aafe345vfk";
		char[] c=a.toCharArray();
		String b="";
		boolean value=true;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>'0' && a.charAt(i)<'9' && value==true) {
				value=false;
			}
			else {
			b=c[i]+b;	
			}
		}
		System.out.println(b);
	}
}
