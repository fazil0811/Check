package oops;
public class Test {
	private String brand;
	private int age;
	
	public Test(String b,int a) {
		brand=b;
		age=a;
	}
	public String toString() {
		return brand+age;
	}
}
class Test1 extends Test {
	public Test1(String b,int a) {
	super(b,a);
	}
	public int getsalary(int a) {
		return a;
	}
}