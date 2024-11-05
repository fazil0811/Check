package Reserve;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Details detail = new Details();

		Scanner s = new Scanner(System.in);

		boolean value = true;

		while (value) {
			System.out.println("1.Book Ticket \n 2.Cancel Ticket \n 3.Available Ticket \n 4.View Ticket");

			int choice = s.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter Name, Enter Age, Enter Berthpreference L,U (or) M");

				String name = s.next();
				int age = s.nextInt();
				String berthpreference = s.next();

				Passenger p = new Passenger(name, age, berthpreference);
				detail.ticketBook(p);
				break;

			case 2: System.out.println("Enter your passengerid");
			
			int id=s.nextInt();
			detail.cancelTicket(id);
			}
		}
	}

}