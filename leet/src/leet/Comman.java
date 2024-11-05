package leet;

public class Comman {
	
	public static void main(String[] args) {
		
		String x="pwwkew";
		char[] a=x.toCharArray();
		int total=0;
		for(int i=0;i<x.length();i++) {
			int count=0;
			for(int j=0;j<x.length();j++) {
				if(i!=j && a[i]==a[j]) {
					count=count+1;
					a[j]='$';
					
				}
			}

			if(count>0 && a[i]!='$') {
				total=total+1;
			}
		}
		System.out.println(total);
	}

}
		
	