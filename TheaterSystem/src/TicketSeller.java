

public class TicketSeller {
	 
	
	public Ticket sellTicket(Ticket ticket, Money money, Audience audience) {
		
		// 계산 로직
		
		ticket.owner = audience;
		
		return ticket; 
	}
	
	public Ticket[] getTickets() {
		
		return new Ticket[10];
	}
}
