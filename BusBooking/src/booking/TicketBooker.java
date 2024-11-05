package booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketBooker {
	
	static int availablewindowseat=1;
	static int availablecornerseat=1;
	
	static List<Integer> availablewindowseatposition=new ArrayList<>(Arrays.asList(1));
	static List<Integer> availablecornerseatposition=new ArrayList<>(Arrays.asList(1));
	
	static List<Integer> bookingticket=new ArrayList<>();
	
	static Map<Integer,Passenger> passengers=new HashMap<>();
	
	public void booked(Passenger p, int seatno, String seatside) {
		p.number=seatno;
		p.alloted=seatside;
		passengers.put(p.passengerid, p);
		bookingticket.add(p.passengerid);
		System.out.println("booked successfully");
	}
	
	
	

}
