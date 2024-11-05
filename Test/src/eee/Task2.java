package eee;
public class Task2 {
	public static void main(String[] args) {
		String[] names= {"pravin","python","karthik","angular"};
		for(int i=0;i<names.length;i++) {
			if(names[i].length()%2==0) {
				char name1=names[i].charAt(names[i].length()/2+names[i].length()/2-1);
				System.out.println(name1);
			}
			else {
				char name2=names[i].charAt(names[i].length()/2);
				System.out.println(name2);
			}
			
		}
		
	}

}


