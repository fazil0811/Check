package task;

import java.util.Arrays;

public class Sk1 {
		public static void main(String[] args) {
			String name="programmer";
			char[] arr=name.toCharArray();
			int repeatcount=0;
			int nonrepeatcount=0;
			for(int i=0;i<arr.length;i++) {
				boolean isvalue=false;
				for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					isvalue=true;
					break;
				}
				}
				if(isvalue==true) {
					repeatcount=repeatcount+1;
				}
				else {
					nonrepeatcount=nonrepeatcount+1;
				}
			}
			System.out.println(repeatcount);
			System.out.println(nonrepeatcount);
		}
	}
		