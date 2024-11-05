package Arrays;

public class ReaarangeArrayElement {
	
	public static void main(String[] args) {
		
		int[] a= {3,1,-2,-5,2,-4};
		
		int[] b=new int[a.length];
		
		int positive=0;
		int negative=1;
		
		for(int x : a) {
			if(x>0) {
				b[positive]=x;
				positive=positive+2;
			}
			if(x<0) {
				b[negative]=x;
				negative=negative+2;
			}
		}
		for(int z : b) {
			System.out.println(z);
		}
	}

}
