package rePractice;
public class Ex4 {
	public static void main(String[] args) {
		String[] ss= {"i,am,prabu,and,i,am,from,canada"};
		String[] names=ss[0].split(",");
		for(int i=0;i<names.length;i++) {
			int count=0;
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					count=count+1;
					names[j]="same";
				}
			}
			if(count>=0 && names[i]!="same")  {
				System.out.println(names[i]);
			}
		}
	}
}