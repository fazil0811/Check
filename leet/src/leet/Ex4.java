package leet;
public class Ex4 {
	public static void main(String[] args) {
		int[] x= {0,0,1,1,1,2,2,3,3,4};
		int count=0;
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x.length;j++) {
                if(i!=j && x[i]==x[j]) {
                	x[j]=-1;
                    
                }
            }
            if(x[i]!=-1) {
            	count++;
            }
        }
        System.out.println(count);
	}
}