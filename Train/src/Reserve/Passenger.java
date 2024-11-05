package Reserve;

public class Passenger {

	static int id;
	String name;
	int age;
	String berthpreference;
	int passengerid;
	int number;
	String alloted;
	
	public Passenger(String name,int age,String berthpreference) {
		this.name=name;
		this.age=age;
		this.berthpreference=berthpreference;
		passengerid=id++;
		number=0;
		alloted="";
	}
}
