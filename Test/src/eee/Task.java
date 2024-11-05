package eee;
public class Task {
	public static void main(String[] args) {
		String name="One#soft";
		String name1="";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)<='#') {
				System.out.println(name.charAt(i));
				
				
				
				for(int i1=0;i1<name.length();i1++) {
					name1=name1+name.charAt(i1);
					System.out.println(name1);
					
					
				}
				
			}
			
		}
	}

}
