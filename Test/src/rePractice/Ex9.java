package rePractice;
public class Ex9 {
	public static void main(String[] args) {
	int[] num= {53,23,54,43,24};
    int temp=0;
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]>num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	System.out.println(num[i]);
	}
	}
}