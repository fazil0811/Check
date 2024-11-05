package oopsHomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee("fazil", 26, 43564);
		Employee e2 = new Employee("udhaya", 26, 54262);
		Employee e3 = new Employee("santhanam", 27, 75352);
		Employee e4 = new Employee("jayam", 30, 42632);

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

		Optional<Employee> emp = employees.stream().filter(x -> x.getS() > 25000).sorted(Comparator
				.comparing(Employee::getA).thenComparing(Comparator.comparing(Employee::getN)))
				.findFirst();
		
		emp.stream().forEach(x->System.out.println(x));
		

	}
}

class Employee {
	private String name;
	private int age;
	private int salary;

	public Employee(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
	}

	public void setN(String n) {
		name = n;
	}

	public String getN() {
		return name;
	}

	public void setA(int a) {
		age = a;
	}

	public int getA() {
		return age;
	}

	public void setS(int s) {
		salary = s;
	}

	public int getS() {
		return salary;
	}

	public String toString() {
		return name + age + salary;
	}
}
