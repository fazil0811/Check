package leet;

public class Palindrome {
	public static void main(String[] args) {

	
	String a="a good   example";
	String[] z=a.trim().split("\\s+");
	String x="";
	for(int i=z.length-1;i>=0;i--) {
		x=x+z[i];
		if(i>0) {
			x=x+" ";
		}
	}
	System.out.println(x);
	}

}

	
