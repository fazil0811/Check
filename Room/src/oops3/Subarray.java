package oops3;

import java.util.HashMap;
import java.util.Map;

public class Subarray {
	
	public static void main(String[] args) {
		
		int[] a= {3,1,2,4};
		int k=6;
		
		Map<Integer,Integer> find=new HashMap<>();
		find.put(0, 1);
		
		int sum=0,count=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			int remove=sum-k;
			count=count+find.get(remove);
			find.put(sum, null)
		}
	}

}
