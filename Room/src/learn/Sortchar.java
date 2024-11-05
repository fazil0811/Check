package learn;

public class Sortchar {
	public static void main(String[] args) {

		String a = "tree";

		char[] z=a.toCharArray();

		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if(z[i]<z[j]) {
					char temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
			System.out.println(z[i]);
		}
	}
}