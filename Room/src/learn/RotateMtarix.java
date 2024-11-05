package learn;

import java.util.ArrayList;
import java.util.List;

public class RotateMtarix {
	
	public static void main(String[] args) {
		
		int[][] a= {{1, 2, 3},
				    {4, 5, 6},
				    {7, 8, 9}};
		
		int left=0,top=0,right=a.length,bottom=a[0].length;
		
		List<Integer> ans= new ArrayList<>();
		
		for(int i=bottom;i>=top;i--) {
			ans.add(a[i][left]);
		}
		
		System.out.println(ans);
		
	}

}
