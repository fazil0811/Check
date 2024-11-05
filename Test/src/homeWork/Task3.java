package homeWork;
public class Task3 {
	public static void main(String[] args) {
	String name="bottle";
	char[] a=name.toCharArray();
//	int repeat=0;
//	int nonrepeat=0;
//	for(int i=0;i<name.length();i++) {
//		boolean value=false;
//		int count=0;
//		for(int j=0;j<name.length();j++) {
//			if(i!=j && a[i]==a[j]) {
//				value=true;
//				count=count+1;
//			}
//		}
//		if(value==true) {
//			repeat=repeat+1;
//		}
//			
//		else {
//			nonrepeat=nonrepeat+1;
//			}
//		//System.out.println(repeat);
//		}
//	System.out.println(repeat);
//	System.out.println(nonrepeat);
	
	for(int i =0; i < a.length; i++) {
		int count = 0;
		for(int j = i + 1; j < a.length; j++) {
			if(a[i] == a[j]) {
				count++;
				a[j] = '%';
			}
		}
		if(count > 0 && a[i] != '%') {
			System.out.println(a[i]);
		}
	}
	}
}
