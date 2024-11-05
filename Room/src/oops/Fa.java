package oops;
public class Fa {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String does(String a) {
		return "dd";
	}
}
class TT extends Fa {
	public String does(String b) {
		return "faz";
	}	
}


