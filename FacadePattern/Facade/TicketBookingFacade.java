package FacadePattern.Facade;

import FacadePattern.NotificationManagement;
import FacadePattern.PaymentManagement;
import FacadePattern.TicketManagement;
import FacadePattern.User;

public class TicketBookingFacade {
    
    public void bookTicket(User user, int noOfTickets) {

        TicketManagement ticketManagement = new TicketManagement(user, 5);
        boolean isTicketAvailable = ticketManagement.isTicketAvailable();

        if (isTicketAvailable) {
            float totalPrice = ticketManagement.getTotalPrice();
            PaymentManagement paymentManagement = new PaymentManagement(user, totalPrice);
            paymentManagement.deductPayment();

            NotificationManagement notificationManagement = new NotificationManagement(user);
            notificationManagement.notifyUser();
        }
    }
}
