package FacadePattern;

import FacadePattern.Facade.TicketBookingFacade;

public class main {

    public static void main(String args[]) {

        User user = new User("Param", 25);

        TicketBookingFacade ticketBookingFacade = new TicketBookingFacade();
        ticketBookingFacade.bookTicket(user, 5);
    }

}
