package oops3;
public interface Human {
	public String eat(String a);
	public int sleep(int a);
	public String walk(String a);
}
abstract class  Engineer implements Human {
	public abstract String workForLiving(String a);
	public abstract int showSalary(int a);
	//public abstract String experience(int a);
}
class SoftwareEngineer extends Engineer {
	public String eat(String a) {
		return a;
	}
	public int sleep(int a) {
		return a;
	}
	public String walk(String a) {
		return a;
	}
	public String workForLiving(String a) {
		return a;
	}
	public int showSalary(int a) {
		return a;
	}
	public String experience(int a) {
		if(a>=1 && a<=4) {
			return "4LPA";
		}
		if(a>=5 && a<=9) {
		return "7LPA";
	}
		else if(a>=10 && a<=15) {
			return "10LPA";
		}
		else {
			return "invalid";
		}
	}
}
