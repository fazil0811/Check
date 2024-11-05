package eee;
public class Practice2 {
	public static void main(String[] args) {
		String name="water";
		int count1=0;
		int count2=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				count1=count1+1;
				//System.out.print(i); 
			}
			else {
				count2=count2+1;
				//System.out.print(i);
			}
				
				
			
		}
		System.out.println(count1);
		System.out.println(count2);
	}

}
