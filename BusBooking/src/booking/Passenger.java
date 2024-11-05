package booking;

public class Passenger {
	
	static int id=1;
	String name;
	int age;
	String preference;
	int passengerid;
	String alloted;
	int number;
	
	public Passenger(String na,int ag,String preference ) {
		name=na;
		age=ag;
		this.preference=preference;
		passengerid=id++;
		alloted="";
		number=0;
	}

}
