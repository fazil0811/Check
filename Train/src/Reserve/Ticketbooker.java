package Reserve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Ticketbooker {

	static int lowerberthavailable = 1;
	static int upperberthavailable = 1;
	static int middleberthavailable = 1;
	static int racticketavailable = 1;
	static int waitinglistticketavailable = 1;

	static List<Integer> bookTicketList = new ArrayList<>();
	static Queue<Integer> WaitingList = new LinkedList<>();
	static Queue<Integer> racList = new LinkedList<>();

	static List<Integer> lowerberthposition = new ArrayList<>(Arrays.asList(1));
	static List<Integer> upperberthposition = new ArrayList<>(Arrays.asList(1));
	static List<Integer> middleberthposition = new ArrayList<>(Arrays.asList(1));
	static List<Integer> racposition = new ArrayList<>(Arrays.asList(1));
	static List<Integer> waitinglistposition = new ArrayList<>(Arrays.asList(1));

	Map<Integer, Passenger> passengers = new HashMap<>();

	public void ticketBook(Passenger p, int berthinfo, String allocatedberth) {
		p.number = berthinfo;
		p.alloted = allocatedberth;

		passengers.put(p.passengerid, p);
		bookTicketList.add(p.passengerid);
		System.out.println("Book Successfully");
	}

	public void racTicket(Passenger p, int seatinfo, String allocatedseat) {
		p.number = seatinfo;
		p.alloted = allocatedseat;

		passengers.put(p.passengerid, p);
		racList.add(p.passengerid);
	}

	public void waitingList(Passenger p, int waiting, String waitingalloted) {
		
		
		p.number = waiting;
		p.alloted = waitingalloted;

		passengers.put(p.passengerid, p);
		WaitingList.add(p.passengerid);
	}

	public void cancelTicket(int id) {

		Details detail=new Details();
		Passenger p = passengers.get(id);
		passengers.remove(id);
		bookTicketList.remove(id);

		int position = p.number;
		System.out.println("Cancelled Successfully");

		if (p.alloted.equals("L")) {
			lowerberthavailable++;
			lowerberthposition.add(position);
		}

		else if (p.alloted.equals("U")) {
			upperberthavailable++;
			upperberthposition.add(position);
		}

		else if (p.alloted.equals("M")) {
			middleberthavailable++;
			middleberthposition.add(position);
		}

		if (racList.size() > 0) {
			Passenger rac=passengers.get(racList.poll());
			int racposition=rac.number;
			racList.remove(rac.passengerid);
			racticketavailable++;
			Ticketbooker.racposition.add(racposition);
			detail.ticketBook(rac);
			
			if(WaitingList.size()>0) {
				Passenger wl=passengers.get(WaitingList.poll());
					int wlposition=wl.number;
					WaitingList.remove(wl.passengerid);
					waitinglistticketavailable++;
					waitinglistposition.add(wlposition);
					
					wl.number=Ticketbooker.racposition.get(0);
					wl.alloted="RAC";
					Ticketbooker.racposition.remove(0);
					racList.add(wl.passengerid);
					
					waitinglistticketavailable++;
					racticketavailable--;
				}
			}
		}
	
}