package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseTask {
	public static void main(String[] args) {

		Task t1 = new Task("swift", 400000, true);
		Task t2 = new Task("innova", 900000, true);
		Task t3 = new Task("audi", 3000000, false);

		List<Task> tasks = Arrays.asList(t1, t2, t3);

		List<Character> task1 = tasks.stream().map(x -> x.getBrand().charAt(x.getBrand().length() - 1))
				.collect(Collectors.toList());
		task1.forEach(x -> System.out.println(x));
		System.out.println();

		Map<String, Task> task2 = tasks.stream().collect(Collectors.toMap(x -> x.getBrand(), y -> y));
		task2.forEach((x, y) -> System.out.println(y));
		System.out.println();
		task2.keySet().forEach(x -> System.out.println(x));
		System.out.println();

		List<Integer> do1 = tasks.stream().map(x -> x.getPrice()).sorted().collect(Collectors.toList());
		do1.forEach(x -> System.out.println(x));
		System.out.println();

		List<Integer> do2 = tasks.stream().map(x -> x.getPrice()).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		do2.forEach(x -> System.out.println(x));
		System.out.println();

		int secondmax = tasks.stream().map(x -> x.getPrice()).distinct().sorted().skip(1).findFirst().get();
		System.out.println(secondmax);
		System.out.println();

		Task first = tasks.stream().max(Comparator.comparing(Task::getPrice)).get();
		System.out.println(first);
		System.out.println();

		List<Task> do3 = tasks.stream().map(x -> {
			x.setPrice(x.getPrice() + 1);
			return x;
		}).collect(Collectors.toList());
		do3.forEach(x -> System.out.println(x));

		int total = tasks.stream().map(x -> x.getPrice()).collect(Collectors.summingInt(y -> y));
		System.out.println(total);
		System.out.println();

		List<String> do4 = tasks.stream().map(x -> x.getBrand()).limit(2).collect(Collectors.toList());
		do4.forEach(x -> System.out.println(x));
		System.out.println();
		
		

	}

}

class Task {
	private String brand;
	private int price;
	private boolean isAffordable;

	public void setBrand(String b) {
		brand = b;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public void setIsAffordable(boolean i) {
		isAffordable = i;
	}

	public boolean getIsAffordable() {
		return isAffordable;
	}

	public Task(String b, int p, boolean i) {
		brand = b;
		price = p;
		isAffordable = i;
	}

	public String toString() {
		return brand + " " + price + " " + isAffordable;
	}
}
