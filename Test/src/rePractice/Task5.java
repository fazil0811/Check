package rePractice;
public class Task5 {
	public static void main(String[] args) {
		String name="I AM FROM BANGLORE";
		String[] names=name.split(" ");
		for(int i=names.length-1;i>=0;i--) {
			
			String t="";
		for(int j=names[i].length()-1;j>=0;j--) {
			
			t=t+names[i].charAt(j);
			
		}
		System.out.print(t+" ");
		}
	}

}
