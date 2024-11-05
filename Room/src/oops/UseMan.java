package oops;
public class UseMan {
	public static void main(String[] args) {
		Man1 m=new Man1();
		m.setBrand("xxx");
		m.setAge(32);
		System.out.println(m.getAge()+m.getBrand()+m.findSalary(56422));
	}
}
