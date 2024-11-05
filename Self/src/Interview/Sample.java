package Interview;

public class Sample {

	static int a = 10;

	public Sample() {
		a++;
		// System.out.println(a);
	}

	public static String getname() {
		return "Hello worlld";
	}

	static {
		System.out.println("Hi Hello Vanakam");
	}

	public static void main(String[] args) {
		// Sample s1= new Sample(); this also we used for iteration
		System.out.println(Sample.getname());
		System.out.println(Sample.a);
	}

}
