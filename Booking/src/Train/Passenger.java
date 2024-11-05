package Train;

public class Passenger {

	static int id;
	String name;
	int age;
	String berthpreference;
	int passengerid;
	String allocated;
	int number;

	public Passenger(String name, int age, String berthpreference) {
		this.name = name;
		this.age = age;
		this.berthpreference = berthpreference;
		passengerid = id++;
		allocated = "";
		number = 0;
	}

}
