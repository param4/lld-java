package FacadePattern;

public class PaymentManagement {
    private User user;
    private float price;
    
    
    public PaymentManagement(User user, float price) {
        this.user = user;
        this.price = price;
        System.out.println("Intitalizig payment of " + price + " for user : " + user.getName());
    }
    
    
    public void deductPayment() {
        System.out.println("Deducting payment of " + this.price + " from user : " + this.user.getName());
    }
}
