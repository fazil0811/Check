package homeWork;
public class Sum13 {
	public static void main(String[] args) {
		String[] names= {"fazil","udhaya","santhanam"};
		String max=names[0];
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>max.length()) {
				max=names[i];
			}
		}
		System.out.println(max);
		
	}

}
