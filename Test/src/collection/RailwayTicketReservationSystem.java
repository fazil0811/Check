package collection;

import java.util.*;

class Ticket {
    String pnr;
    String passengerName;
    String berthType;
    boolean isRac;

    public Ticket(String pnr, String passengerName, String berthType, boolean isRac) {
        this.pnr = pnr;
        this.passengerName = passengerName;
        this.berthType = berthType;
        this.isRac = isRac;
    }

    @Override
    public String toString() {
        return "PNR: " + pnr + ", Name: " + passengerName + ", Berth: " + berthType + (isRac ? " (RAC)" : "");
    }
}

class Cabin {
    private static final int TOTAL_SEATS = 18;
    private static final int CONFIRMED_SEATS = 15;
    private static final int RAC_LIMIT = 3;
    private Ticket[] confirmedBookings = new Ticket[CONFIRMED_SEATS];
    private Ticket[] racList = new Ticket[RAC_LIMIT];
    private Ticket[] waitingList = new Ticket[TOTAL_SEATS - CONFIRMED_SEATS - RAC_LIMIT];
    private int confirmedCount = 0;
    private int racCount = 0;
    private int waitingCount = 0;

    public boolean bookTicket(String passengerName, String preferredBerth) {
        // Check for confirmed seat availability
        if (confirmedCount < CONFIRMED_SEATS) {
            String seatType = assignSeat(preferredBerth);
            if (seatType != null) {
                String pnr = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(pnr, passengerName, seatType, false);
                confirmedBookings[confirmedCount++] = ticket;
                System.out.println("Ticket booked successfully: " + ticket);
                return true;
            }
        }

        // If confirmed seats are unavailable, check RAC
        if (racCount < RAC_LIMIT) {
            String pnr = UUID.randomUUID().toString();
            Ticket ticket = new Ticket(pnr, passengerName, "RAC", true);
            racList[racCount++] = ticket;
            System.out.println("Ticket added to RAC: " + ticket);
            return true;
        }

        // If RAC is also full, add to waiting list
        if (waitingCount < waitingList.length) {
            String pnr = UUID.randomUUID().toString();
            Ticket ticket = new Ticket(pnr, passengerName, "Waiting List", false);
            waitingList[waitingCount++] = ticket;
            System.out.println("Ticket added to Waiting List: " + ticket);
            return false;
        }

        System.out.println("No seats available for booking.");
        return false;
    }

    private String assignSeat(String preferredBerth) {
        // For simplicity, return preferred berth directly
        return preferredBerth; // Implement your seat assignment logic
    }

    public void cancelTicket(String pnr) {
        for (int i = 0; i < confirmedCount; i++) {
            if (confirmedBookings[i].pnr.equals(pnr)) {
                Ticket ticket = confirmedBookings[i];
                confirmedBookings[i] = confirmedBookings[--confirmedCount]; // Remove and shift
                System.out.println("Ticket cancelled: " + ticket);

                if (racCount > 0) {
                    Ticket racPassenger = racList[--racCount];
                    racList[racCount] = null; // Clear reference
                    racPassenger.berthType = "Confirmed"; // Promote RAC to confirmed
                    confirmedBookings[confirmedCount++] = racPassenger;
                    System.out.println("RAC promoted to confirmed: " + racPassenger);
                }
                return;
            }
        }

        for (int i = 0; i < racCount; i++) {
            if (racList[i].pnr.equals(pnr)) {
                Ticket racTicket = racList[i];
                racList[i] = racList[--racCount]; // Remove and shift
                System.out.println("RAC ticket cancelled: " + racTicket);
                return;
            }
        }

        System.out.println("Ticket with PNR not found.");
    }

    public void listAllTickets() {
        System.out.println("Confirmed Tickets:");
        for (int i = 0; i < confirmedCount; i++) {
            System.out.println(confirmedBookings[i]);
        }
        
        System.out.println("RAC Tickets:");
        for (int i = 0; i < racCount; i++) {
            System.out.println(racList[i]);
        }
        
        System.out.println("Waiting List Tickets:");
        for (int i = 0; i < waitingCount; i++) {
            System.out.println(waitingList[i]);
        }
    }
}

public class RailwayTicketReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cabin cabin = new Cabin();

        while (true) {
            System.out.println("1. Booook Ticket\n2. Cancel Ticket\n3. List All Tickets\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter preferred berth (lower, upper, middle, side upper): ");
                    String berth = scanner.nextLine();
                    cabin.bookTicket(name, berth);
                    break;
                case 2:
                    System.out.print("Enter PNR to cancel: ");
                    String pnr = scanner.nextLine();
                    cabin.cancelTicket(pnr);
                    break;
                case 3:
                    cabin.listAllTickets();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}



