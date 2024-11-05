package rePractice;
public class Task3 {
	public static void main(String[] args) {
		int[] num= {1,2,2,3,5,4,4,5};
		int total=0;
		for(int i=0;i<num.length;i++) {
			int count=0;
			for(int j=0;j<num.length;j++) {
				if(i!=j && num[i]==num[j]) {
					count=count+1;
				}
			}
			if(count>0) {
				total=total+num[i];
				
			}
		}
		System.out.println(total);
	}
}