package learn;
public class Ex5 {
	public static void main(String[] args) {
		String[] a= {"python","java","udhaya","fazil"};
		String z="";
		for(int i=0;i<a.length;i++) {
			//String z="";
			if(i%2==1) {
				z=z+a[i];
			System.out.println(a[i].charAt(a[i].length()/2));
			}
		}
	}

}
