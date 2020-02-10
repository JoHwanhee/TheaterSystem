
public class Audience {
	TicketOffice ticketOffice;
	Bag bag;
	
	public void buyTicket() {
		Ticket selectTicket = selectTicket(ticketOffice.ticketSeller.getTickets());
		bag.ticket = ticketOffice.ticketSeller.sellTicket(selectTicket, bag.money, this);
	}
	
	private Ticket selectTicket(Ticket[] tickets) {
		return tickets[0];
	}
}
