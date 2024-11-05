package rePractice;
public class Ex5 {
	public static void main(String[] args) {
		String[] name= {"i,am,a,developer"};
		String[]names=name[0].split(",");
		for(int i=0;i<names.length;i++) {
			String a="";
			for(int j=names[i].length()-1;j>=0;j--) {
				a=a+names[i].charAt(j);
				//System.out.println(a);
			}
			System.out.print(a+" ");
		}
	}

}
