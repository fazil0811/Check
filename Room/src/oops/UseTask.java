package oops;
public class UseTask {
	public static void main(String[] args) {
		Task1 t=new Task1();
		t.setName("aaa");
		t.setAge(31);
		t.brand="bbb";
		t.isGood=true;
		System.out.println(t.getName()+t.getAge()+t.brand+t.isGood);
	}

}
