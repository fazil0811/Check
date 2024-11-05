package homeWork;
public class Sum5 {
	public static void main(String[] args) {
		String[] names= {"aravind","udhaya","ajay","fazil","santhanam"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("a")) {
				count=count+1;
				
			}
		}
		System.out.println(count);
	}

}
