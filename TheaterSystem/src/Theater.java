
public class Theater {
	Screening[] screenings;
	
	public void join(Audience audience) {
		audience.buyTicket();
		rightTicket(audience.bag.ticket);
	}
	
	private	boolean rightTicket(Ticket ticket) 
	{
		for (Screening screening : screenings) {
			for (Movie movie : screening.movies) {
				if(movie == ticket.movie) {
					return true;
				}
			}
		}
		return false;
	}
}
