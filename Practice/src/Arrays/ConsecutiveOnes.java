package Arrays;

public class ConsecutiveOnes {
	
	public static void main(String[] args) {
		
		int[] a= {1,1,1,1,0,1,1,1};
		
		int count=0;
		int total=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
				if(count>total) {
					total=count;
				}
			}
			else {
				count=0;
			}
		}
		System.out.println(total);
	}

}
