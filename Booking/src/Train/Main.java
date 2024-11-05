package Train;

import java.util.Scanner;

public class Main {
	
	public static void bookticket(Passenger p) {
		
		Book booker=new Book();
		if(Book.availabewaitinglist==0) {
			System.out.println("No ticket available");
		}
		if((p.berthpreference.equals("L") && Book.availablelowerberth>0) ||
		(p.berthpreference.equals("M") && Book.availablemiddleberth>0) ||
		(p.berthpreference.equals("U") && Book.availableupperberth>0)) {
			System.out.println("Perferred birth available");
			
			if(p.berthpreference.equals("L")) {
				System.out.println("Lower Birth Given");
				booker
			}
		}
	}
	public static void main(String[] args) {
//
//		Scanner s = new Scanner(System.in);
//		boolean value = true;
//
//		while (true) {
//			System.out.println("1.Book Ticket \n 2.Cancel Ticket \n 3.Available Ticket \n 4.Booked Ticket \n 5.exit");
//			int choice = s.nextInt();
//			switch (choice) {
//			case 1:
//				System.out.println("Enter Passenger Name, age, berthpreference(L,M or U");
//				String name = s.next();
//				int age = s.nextInt();
//				String berthpreference = s.next();
//				Passenger p = new Passenger(name, age, berthpreference);
//
//			}
		}
	}


