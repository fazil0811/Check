package rePractice;
public class Task4 {
	public static void main(String[] args) {
		String name="I AM FROM BANGLORE";
		String[] names=name.split(" ");
		for(int i=names.length-1;i>=0;i--) {
//			String a="";
//			a=a+names[i];
			if(i%2==0) {
				System.out.print(names[i].toLowerCase()+" ");
			}
			else {
			System.out.print(names[i]+ " ");
			}
		}
	}
}
