package task;
public class Task1 {
	public static void main(String[] args) {
		String[] a= {"ram", "raj", "ramraj"};
		String b=a[0].concat(a[1]);
		if(b.equals(a[2])) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not");
		}
	}

}
