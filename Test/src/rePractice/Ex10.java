package rePractice;
public class Ex10 {
	public static void main(String[] args) {
		int[] arr= {53,43,54,78,62};
		int fm=0;
		int sm=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					sm=fm;
					fm=arr[i];
				}
			}
			if(arr[i]>sm && arr[i]!=fm) {
				sm=arr[i];
			}
		}
		System.out.println(fm);
		System.out.println(sm);
	}

}
