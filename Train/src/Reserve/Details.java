package Reserve;

public class Details {

	public void ticketBook(Passenger p) {

		Ticketbooker booker = new Ticketbooker();

		if (Ticketbooker.waitinglistticketavailable == 0) {
			System.out.println("No ticket available");

			if ((p.berthpreference.equals("L") && Ticketbooker.lowerberthavailable > 0)
					|| (p.berthpreference.equals("U") && Ticketbooker.upperberthavailable > 0)
					|| (p.berthpreference.equals("M") && Ticketbooker.middleberthavailable > 0)) {
				System.out.println("Preference berth available");

				if (p.berthpreference.equals("L")) {
					System.out.println("Lower Berth Given");

					booker.ticketBook(p, Ticketbooker.lowerberthposition.get(0), "L");
					Ticketbooker.lowerberthavailable--;
					Ticketbooker.lowerberthposition.remove(0);
				}

				else if (p.berthpreference.equals("U")) {
					System.out.println("Upper Berth Given");

					booker.ticketBook(p, Ticketbooker.upperberthposition.get(0), "U");
					Ticketbooker.upperberthavailable--;
					Ticketbooker.upperberthposition.remove(0);
				}

				else if (p.berthpreference.equals("M")) {
					System.out.println("Middle Berth Given");

					booker.ticketBook(p, Ticketbooker.middleberthposition.get(0), "M");
					Ticketbooker.middleberthavailable--;
					Ticketbooker.middleberthposition.remove(0);
				}
			}

			else if (Ticketbooker.lowerberthavailable > 0) {
				System.out.println("Lower berth given");

				booker.ticketBook(p, Ticketbooker.lowerberthposition.get(0), "L");
				Ticketbooker.lowerberthavailable--;
				Ticketbooker.lowerberthposition.remove(0);
			}

			else if (Ticketbooker.upperberthavailable > 0) {
				System.out.println("Upper berth given");

				booker.ticketBook(p, Ticketbooker.upperberthposition.get(0), "U");
				Ticketbooker.upperberthavailable--;
				Ticketbooker.upperberthposition.remove(0);
			}

			else if (Ticketbooker.middleberthavailable > 0) {
				System.out.println("Middle berth given");

				booker.ticketBook(p, Ticketbooker.middleberthposition.get(0), "M");
				Ticketbooker.middleberthavailable--;
				Ticketbooker.middleberthposition.remove(0);
			}
			
			else if(Ticketbooker.racticketavailable>0) {
				System.out.println("Rac Given");
				
				booker.racTicket(p, Ticketbooker.racposition.get(0), "RAC");
				Ticketbooker.racticketavailable--;
				Ticketbooker.racposition.remove(0);
			}
			
			else if(Ticketbooker.waitinglistticketavailable>0) {
				System.out.println("Waiting List");
				
				booker.waitingList(p, Ticketbooker.waitinglistposition.get(0), "WL");
				Ticketbooker.waitinglistticketavailable--;
				Ticketbooker.waitinglistposition.remove(0);
			}
		}
	}

	public void cancelTicket(int id) {
		Ticketbooker booker=new Ticketbooker();
		
		if(!booker.passengers.containsKey(id)) {
			System.out.println("Unknown passenger");
		}
		else {
			booker.cancelTicket(id);
		}
		
	}

}
