package learn;
public class Ex4 {
	public static void main(String[] args) {
		String[] a= {"python","java","udhaya","fazil"};
		String z="";
		for(int i=0;i<a.length;i++) {
			z=z+a[i].charAt(a[i].length()/2);
			//
		}
		System.out.println(z);
	}
}