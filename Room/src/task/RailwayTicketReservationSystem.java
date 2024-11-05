package task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//public class RailwayTicketReservationSystem {		 
class RailwayTicketReservationSystem {
	// Berth types
	enum BerthType {
		LOWER, UPPER, MIDDLE, SIDE_UPPER
	}

	// Seat class to store seat details
	static class Seat {
		int seatNumber;
		BerthType berthType;
		boolean isBooked;
		String passengerName;

		Seat(int seatNumber, BerthType berthType) {
			this.seatNumber = seatNumber;
			this.berthType = berthType;
			this.isBooked = false;
		}
	}

	// PNR record for ticket details
	static class PNR {
		int pnrNumber;
		List<Seat> bookedSeats;
		String passengerNames;

		PNR(int pnrNumber, List<Seat> bookedSeats, String passengerNames) {
			this.pnrNumber = pnrNumber;
			this.bookedSeats = bookedSeats;
			this.passengerNames = passengerNames;
		}

		void showTicket() {
			System.out.println("PNR: " + pnrNumber);
			System.out.println("Passenger Names: " + passengerNames);
			for (Seat seat : bookedSeats) {
				System.out.println(
						"Seat: " + seat.seatNumber + " | Berth: " + seat.berthType + " | Name: " + seat.passengerName);
			}
		}
	}

	static class Cabin {
		List<Seat> seats = new ArrayList<>();
		List<PNR> confirmedTickets = new ArrayList<>();
		Queue<PNR> racQueue = new LinkedList<>();
		Queue<PNR> waitingList = new LinkedList<>();
		int nextPNR = 1;
		int maxSeats = 15;
		int racLimit = 3;
		int waitingListLimit = 5;

		public Cabin() {
			// Initializing the seats in the cabin with 4 upper, 4 lower, 4 middle, and 3
			// side upper.
			int seatNumber = 1;
			for (int i = 0; i < 4; i++)
				seats.add(new Seat(seatNumber++, BerthType.LOWER));
			for (int i = 0; i < 4; i++)
				seats.add(new Seat(seatNumber++, BerthType.UPPER));
			for (int i = 0; i < 4; i++)
				seats.add(new Seat(seatNumber++, BerthType.MIDDLE));
			for (int i = 0; i < 3; i++)
				seats.add(new Seat(seatNumber++, BerthType.SIDE_UPPER));
		}

		public void bookTicket(String passengerName, BerthType preferredBerth) {
			List<Seat> bookedSeats = new ArrayList<>();
			for (Seat seat : seats) {
				if (!seat.isBooked && (seat.berthType == preferredBerth || preferredBerth == null)) {
					seat.isBooked = true;
					seat.passengerName = passengerName;
					bookedSeats.add(seat);
					System.out.println("Booked " + seat.berthType + " for " + passengerName);
					break;
				}
			}

			if (bookedSeats.size() > 0) {
				PNR pnr = new PNR(nextPNR++, bookedSeats, passengerName);
				confirmedTickets.add(pnr);
				pnr.showTicket();
			} else if (racQueue.size() < racLimit) {
				System.out.println("No confirmed berth available. Allocating RAC seat.");
				racQueue.add(new PNR(nextPNR++, bookedSeats, passengerName));
			} else if (waitingList.size() < waitingListLimit) {
				System.out.println("No confirmed berth or RAC seat available. Adding to waiting list.");
				waitingList.add(new PNR(nextPNR++, bookedSeats, passengerName));
			} else {
				System.out.println("No seats available, and waiting list is full.");
			}
		}

		public void cancelTicket(int pnrNumber) {
			// Cancel a ticket and move passengers from RAC or waiting list if applicable
			PNR ticketToCancel = null;
			for (PNR pnr : confirmedTickets) {
				if (pnr.pnrNumber == pnrNumber) {
					ticketToCancel = pnr;
					break;
				}
			}

			if (ticketToCancel != null) {
				confirmedTickets.remove(ticketToCancel);
				for (Seat seat : ticketToCancel.bookedSeats) {
					seat.isBooked = false;
				}
				System.out.println("Ticket with PNR " + pnrNumber + " has been canceled.");
				if (!racQueue.isEmpty()) {
					PNR racPassenger = racQueue.poll();
					confirmedTickets.add(racPassenger);
					System.out.println("RAC passenger moved to confirmed booking: PNR " + racPassenger.pnrNumber);
				} else if (!waitingList.isEmpty()) {
					PNR waitlistedPassenger = waitingList.poll();
					racQueue.add(waitlistedPassenger);
					System.out.println("Waiting list passenger moved to RAC: PNR " + waitlistedPassenger.pnrNumber);
				}
			} else {
				System.out.println("Ticket with PNR " + pnrNumber + " not found.");
			}
		}

		public void showAllBookedTickets() {
			System.out.println("All Confirmed Bookings:");
			for (PNR pnr : confirmedTickets) {
				pnr.showTicket();
			}
			System.out.println("RAC List:");
			for (PNR pnr : racQueue) {
				pnr.showTicket();
			}
			System.out.println("Waiting List:");
			for (PNR pnr : waitingList) {
				pnr.showTicket();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cabin cabin = new Cabin();

		while (true) {
			System.out.println("1. Book Ticket");
			System.out.println("2. Cancel Ticket");
			System.out.println("3. Show All Booked Tickets");
			System.out.println("4. Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter passenger name:");
				String name = scanner.next();
				System.out.println("Enter preferred berth (1 for LOWER, 2 for UPPER, 3 for MIDDLE, 4 for SIDE_UPPER):");
				int berthChoice = scanner.nextInt();
				BerthType berthType = null;
				switch (berthChoice) {
				case 1:
					berthType = BerthType.LOWER;
					break;
				case 2:
					berthType = BerthType.UPPER;
					break;
				case 3:
					berthType = BerthType.MIDDLE;
					break;
				case 4:
					berthType = BerthType.SIDE_UPPER;
					break;
				}
				cabin.bookTicket(name, berthType);
				break;

			case 2:
				System.out.println("Enter PNR number to cancel:");
				int pnr = scanner.nextInt();
				cabin.cancelTicket(pnr);
				break;

			case 3:
				cabin.showAllBookedTickets();
				break;

			case 4:
				System.exit(0);
			}
		}
	}

}
