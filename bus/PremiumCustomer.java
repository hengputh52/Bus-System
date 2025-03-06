public class PremiumCustomer extends Customer {
    private double discountRate;

    // Constructor for PremiumCustomer
    public PremiumCustomer(String fullName, int age, String gender, String phone, String email, String address, String password, double discountRate) {
        // Call to the superclass constructor (Customer)
        super(fullName, age, gender, phone, email, address, password);
        this.discountRate = discountRate;
    }


    // Apply discount on the given amount
    public void applyDiscount(double amount) {
        double discountedAmount = amount - (amount * discountRate / 100);
        System.out.println("Discounted price: $" + discountedAmount);
    }

    // Override bookTicket to provide premium booking behavior
    @Override
    public void bookTicket(int busID, String destination, String travelDate) {
        System.out.println("Premium booking for " + username + " on Bus " + busID + " to " + destination + " on " + travelDate);
    }

    // Override toString to include the discount rate
    @Override
    public String toString() {
        return super.toString() + ", Discount Rate=" + discountRate + "%";
    }

    // Override the login method to include premium customer specific behavior (e.g., log additional message)
    @Override
    public boolean login(String username, String password) {
        boolean loginSuccessful = super.login(username, password); // call to parent class login method
        if (loginSuccessful) {
            System.out.println("Welcome, Premium customer " + username);
        }
        return loginSuccessful;
    }

    // Override the logout method to include premium customer specific behavior (e.g., log additional message)
    @Override
    public void logout() {
        super.logout();  // call to parent class logout method
        System.out.println("Thank you for using the Premium services, " + username);
    }
}
