package task;
public class Task4 {
	public static void main(String[] args) {
		int[] a= {32,54,21,76,24};
		
		int first=0;
		int second=0;
		for(Integer x : a) {
			if(x>first) {
				first=x;
			}
			else {
				if(x>second && x!=first) {
					second=x;
				}
			}
		}
		System.out.println(first);
		System.out.println(second);
		
	}

}
