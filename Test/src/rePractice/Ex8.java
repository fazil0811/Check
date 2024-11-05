package rePractice;
public class Ex8 {
	public static void main(String[] args) {
		int[] arr= {42,57,75,42,85,57};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
