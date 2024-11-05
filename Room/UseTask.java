package polymorphism;
public class UseTask {
	public static void main(String[] args) {
		String a="fazil";
		String b="udhaya";
		int c=94;
		int d=33;
		Task t=new Task();
		System.out.println(t.findmax(a, b));
		System.out.println(t.findmax(c, d));
	}

}
