package oops;
public class Man {
	private String brand;
	private int age;
	
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
}
class Man1 extends Man {
	public int findSalary(int a) {
		return a;
	}
}
