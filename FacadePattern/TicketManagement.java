package FacadePattern;

public class TicketManagement {
    private static float basePrice = 100f;
    private User user;
    private int noOfTickets;

    public TicketManagement(User user, int noOfTickets) {
        this.user = user;
        this.noOfTickets = noOfTickets;
        System.out.println("Intitialized Ticket Booking Process of " + this.noOfTickets + " for " + this.user.getName());
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public float getTotalPrice() {
        return this.noOfTickets * TicketManagement.basePrice;
    }

    public User getUser() {
        return user;
    }

    public boolean isTicketAvailable() {
        return true;
    }
}
 