package Interview;

public class Ex7 {
	
	public static void main(String[] args) {
		
		int[] a= {3,0,1};
		
		int b=a.length;
		
		int sum=0;
		
		int total=b*(b+1)/2;
		
		for(int x : a) {
			sum=sum+x;
		}
		int fin=total-sum;
		System.out.println(fin);
		
		
	}

}
