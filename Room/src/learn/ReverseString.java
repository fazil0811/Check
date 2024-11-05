package learn;

public class ReverseString {
	public static void main(String[] args) {

		String a = " a good   example ";

		String[] z = a.trim().split("\\s+");

		String b = "";

		for (int i = z.length-1; i >= 0; i--) {
			b = b + z[i];
			if(i>0) {
				b=b+" ";
			}
			
		}
		System.out.println(b);
	}
}