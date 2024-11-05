package booking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		boolean value = true;

		while (true) {
			System.out.println("1.BookTicket \n 2.Cancel Ticket \n 3. View Ticket");

			int given = s.nextInt();

			switch (given) {
			case 1:
				System.out.println("Enter Name,Enter age,EnterPreference");
				String name = s.next();
				int age = s.nextInt();
				String preference = s.next();

				Passenger p = new Passenger(name, age, preference);
				booking(p);
			}
		}
	}

	private static void booking(Passenger p) {

		TicketBooker book = new TicketBooker();

		if (TicketBooker.availablecornerseat == 0 && TicketBooker.availablewindowseat == 0) {
			System.out.println("no ticketavailable");
		}

		if ((p.preference.equals("C") && TicketBooker.availablecornerseat > 0)
				|| p.preference.equals("W") && TicketBooker.availablewindowseat > 0) {
			System.out.println("ticket available");

			if (p.preference.equals("C")) {
				System.out.println("Corner Seat");
				book.booked(p, TicketBooker.availablecornerseatposition.get(0), "C");
				TicketBooker.availablecornerseat--;
				TicketBooker.availablecornerseatposition.remove(0);
			}

			else if (p.preference.equals("W")) {
				System.out.println("Window Seat");
				book.booked(p, TicketBooker.availablewindowseatposition.get(0), "W");
				TicketBooker.availablewindowseat--;
				TicketBooker.availablewindowseatposition.remove(0);
			}
		}

		else if (TicketBooker.availablecornerseat > 0) {
			System.out.println("corner available");
			book.booked(p, TicketBooker.availablecornerseatposition.get(0), "C");
			TicketBooker.availablecornerseat--;
			TicketBooker.availablecornerseatposition.remove(0);
		}

		else if (TicketBooker.availablewindowseat > 0) {
			System.out.println("Window Available");
			book.booked(p, TicketBooker.availablewindowseatposition.get(0), "W");
			TicketBooker.availablewindowseat--;
			TicketBooker.availablewindowseatposition.remove(0);
		}

	}

}
