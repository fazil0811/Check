package eee;
public class Task1 {
	public static void main(String[] args) {
		String[] names= {"pravin","python","karthik","angular"};
		for(int i=0;i<names.length;i++) {
			if(names[i].length()%2==0) {
				String name1=names[i].substring(names[i].length()/2-1,names[1].length()/2+1);
				System.out.println(name1);
			}
			else {
				char name2=names[i].charAt(names[i].length()/2);
				System.out.println(name2);
			}
			
		}
		
	}

}
