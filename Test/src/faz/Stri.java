package faz;

public class Stri {
	
	public static void main(String[] args) {
		
		String a="34975";
		
		for(int i=a.length()-1;i>=0;i--) {
			if((a.charAt(i)-'0')%2==1) {
				System.out.println(a.substring(0,i+1));
				break;
			}
			else {
				System.out.println("");
			}
		}
		
	}
}