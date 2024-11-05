package Interview;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int[] a= {1, 2, 3, 4, 5};
		
		int[] b=new int[2];
		
		int fm=0;
		int sm=0;
		
		int minf=999;
		int mins=999;
		
		for(int x : a) {
			if(x>fm) {
				sm=fm;
				fm=x;
			}
			if(x>sm && x!=fm) {
				sm=x;
			}
		}
		
		for(int y : a) {
			if(y<minf) {
				mins=minf;
				minf=y;
			}
			
			if(y<mins && y!=minf) {
				mins=y;
			}
		}
		b[0]=sm;
		b[1]=mins;
		for(int z : b) {
			System.out.println(z);
		}
	}
}
		
		