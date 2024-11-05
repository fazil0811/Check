package oops;
public class Employee {
	private String name;
	private int id;
	
	public Employee(String n,int i) {
		name=n;
		id=i;
	}
	public String toString() {
		return name+id;
	}
}
	class Employee1 extends Employee {
		private String company;
		private int salary;
		
		public Employee1(String n,int i,String c,int s) {
			super(n,i);
			company=c;
			salary=s;
		}
		public String toString() {
			return super.toString()+company+salary;
		}
	}
		class Employee2 extends Employee1 {
			private boolean isGood;
			private int age;
			
			public Employee2(String n,int i,String c,int s,boolean g,int a) {
				super(n,i,c,s);
					isGood=g;
					age=a;
				}
			public String toString() {
				return super.toString()+isGood+age;
			}
		}

