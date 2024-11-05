package rePractice;
public class Task2 {
	public static void main(String[] args) {
		String a="she is my college principal madam";
		String[] b=a.split(" ");
		String c=b[b.length-1];
		String d="";
		for(int i=c.length()-1;i>=0;i--) {
			d=d+c.charAt(i);
		}
		if(d.equalsIgnoreCase(c)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
