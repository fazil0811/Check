package rePractice;
public class Task1 {
	public static void main(String[] args) {
		String name="text with a good prototype a";
		String[] names=name.split(" ");
		for(int i=0;i<names.length;i++) {
			String aa="";
			for(int j=0;j<names.length;j++) {
				if(i!=j && names[i].length()==names[j].length()) {
					aa=aa+names[i];
					System.out.print(aa+ " ");
					break;
					}
				}
			}		
	}

}
