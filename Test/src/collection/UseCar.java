package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car("HondaCity", 890000, false);
		Car c2 = new Car("Etios", 988888, false);
		Car c3 = new Car("Swift", 700000, true);

		List<Car> cars = Arrays.asList(c1, c2, c3);

		System.out.println(c1.last(cars));
		System.out.println(c1.store(cars));

	}
}

class Car {
	String brand;
	int price;
	boolean isAffordable;

	List<Character> last(List<Car> a) {
		List<Character> b = a.stream().map(x -> x.brand.charAt(x.brand.length() - 1)).collect(Collectors.toList());
		return b;
	}

	Map<String, Car> store(List<Car> a) {
		Map<String, Car> b = a.stream().collect(Collectors.toMap(x -> x.brand, y -> y));
		return b;
	}

	public Car(String b, int p, boolean i) {
		brand = b;
		price = p;
		isAffordable = i;
	}

	public String toString() {
		return brand + " " + price + " " + isAffordable;
	}
}
