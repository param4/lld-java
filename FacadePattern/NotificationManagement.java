package FacadePattern;

public class NotificationManagement {
    User user;

    public NotificationManagement(User user) {
        this.user = user;
        System.out.println("Intitalizing notification manager for user : " + this.user.getName());
    }

    public void notifyUser() {
        System.out.println("Notifying user : " + this.user.getName());
    }
}
