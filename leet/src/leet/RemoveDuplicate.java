package leet;
public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] x= {0,0,1,1,1,2,2,3,3,4};
		int total=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(i!=j && x[i]==x[j]) {
					x[j]=-1;
				}
			}
			if(x[i]!=-1) {
				total++;
			}
		}
		System.out.println(total);
	}

}

