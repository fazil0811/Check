package eee;
public class Task5 {
	public static void main(String[] args) {
		String[] a= {"java","Angular","C++","john"};
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(0)>='A'&& a[i].charAt(0)<='Z'&&a[i].charAt(1)>='a'&&a[i].charAt(1)<='z') {
				System.out.println(a[i].toUpperCase());
			}
		}
	}

}
